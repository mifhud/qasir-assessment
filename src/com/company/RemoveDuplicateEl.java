package com.company;

import java.util.Scanner;

public class RemoveDuplicateEl {
    static final Scanner sc = new Scanner(System.in);

    static int removeDuplicates(int arr[], int n) {
        // Return, if array is empty or contains a single element
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            // If current element is not equal to next element then store that current element
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = arr[n-1];

        // Modify original array
        for (int i=0; i<j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main (String[] args) {
        System.out.println("Input: ");

        System.out.print("N = ");
        int N = sc.nextInt();

        int a[] = new int[N];

        System.out.println("Enter values");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        sc.nextLine();

        N = removeDuplicates(a, N);

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
