package com.bridgelabz;

public class Smallestelementarray {
    public static void main(String[] args) {
        int arr[] = new int[]{25, 11, 7, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element in the array");
    }
}
