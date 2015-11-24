package com.ashutosh.datastructures.Arrays;

import java.util.Scanner;

/**
 * Created by dell on 11/21/2015.
 */
public class OccuringOddTimes {
    static int getOddOccurrence(int arr[])
    {
        int res = 0;
        for (int i=0; i < arr.length; i++)
            res = res ^ arr[i];

        return res;
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

        int result=getOddOccurrence(arr);
        System.out.println("The number occuring odd number of times is: "+ result);

    }
}
