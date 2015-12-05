package com.ashutosh.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by dell on 11/21/2015.
 */
public class FindMissingNumber {
    static int getMissingNo(int a[])
    {
        int x1 = a[0]; /* For xor of all the elemets in arary */
        int x2 = 1; /* For xor of all the elemets from 1 to n+1 */

        for (int i = 1; i< a.length; i++)
            x1 = x1^a[i];

        for ( int i = 2; i <= a.length+1; i++)
            x2 = x2^i;

        return (x1^x2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result=getMissingNo(arr);
        System.out.println("The number occuring odd number of times is: "+ result);

    }
}
