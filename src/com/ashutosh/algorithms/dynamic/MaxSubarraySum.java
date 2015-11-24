package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/7/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Computes maximum contiguous and maximum noncontiguous subarray sum

public class MaxSubarraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            int sum=arr[0];
            int currmax=arr[0];
            int maxsofar=arr[0];
            for(int i=1;i<n;i++){
                int temp=Math.max(sum+arr[i],arr[i]);
                sum=Math.max(temp,sum);
                currmax=Math.max(currmax+arr[i],arr[i]);
                maxsofar=Math.max(currmax,maxsofar);
            }

            System.out.println(maxsofar+" " +sum);
            t--;
        }

    }
}
