package com.bridgelabz;

public class Oddposition {
    public static void main(String[]args){
        int[]arr=new int[]{7,5,1,3,2};
        System.out.println("Elements is given in array in present on odd position:");
        for(int i=0;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}