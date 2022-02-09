package com.company;

import java.util.Scanner;

public class CountSmallerElements {
    static final Scanner sc = new Scanner(System.in);

    static int binarySearchCount(int arr[], int n, int key) {
        int left = 0;
        int right = n - 1;

        int count = 0;

        while (left <= right) {
            int mid = (right + left) / 2;

            // Check if middle element is less than or equal to key
            if (arr[mid] <= key) {

                // At least (mid + 1) elements are there whose values are less than or equal to key
                count = mid + 1;
                left = mid + 1;
            }

            // If key is smaller, ignore right half
            else
                right = mid - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Input: ");

        System.out.print("N = ");
        final int N = sc.nextInt();

        int a[] = new int[N];

        System.out.println("Enter values A[] = ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        sc.nextLine();
        System.out.print("X = ");
        int x = sc.nextInt();

        int output = binarySearchCount(a, N - 1, x);
        System.out.printf("Output: %d", output);
    }
}
