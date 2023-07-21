package com.bridgelabz;

public class Duplicateelementarray {
    public static void main(String[]args){
        int[]arr=new int[]{1,3,2,4,3,8,9,9,2};
        System.out.println("Duplicate element is given array:");
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]==arr[i])
                    System.out.println(arr[j]);
            }
        }

    }
}
