package com.ashutosh.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by dell on 11/21/2015.
 */
public class ArrayRotation {
    static int[] leftRotatebyOne(int arr[])
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("Enter the size by which you wanto rotate: ");
        int d=sc.nextInt();
        for(int i=0;i<d;i++){
            arr=leftRotatebyOne(arr);
        }
        System.out.print("The new array after rotation is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
