package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/7/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Computes maximum contiguous and maximum non contiguous subarray sum

public class MaxSubarraySum {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int []arr={2 ,-1 ,2, 3 ,4 ,-5};
        int n=arr.length;
        int sum=arr[0];                     //for taking care of non contiguous sum
        int currmax=arr[0];
        int maxsofar=arr[0];                // fpr taking care of contiguous sum
        for(int i=1;i<n;i++){
            int temp=Math.max(sum+arr[i],arr[i]);
            sum=Math.max(temp,sum);
            currmax=Math.max(currmax+arr[i],arr[i]);
            maxsofar=Math.max(currmax,maxsofar);
        }

        System.out.println("Max contiguous sum:"+maxsofar+ " Max non contiguous sum:  " +sum);



    }
}
