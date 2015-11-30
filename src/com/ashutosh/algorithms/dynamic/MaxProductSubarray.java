package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/25/2015.
 */
public class MaxProductSubarray {
    public static void main(String args[]){
        int arr[]={-2, -3, 0, -2, -40};//{6, -3, -10, 0, 2};
        int currmax=arr[0];
        int currmin=arr[0];
        int maxsofar=arr[0];
        int temp1=arr[0];
        int temp2=arr[0];
        int temp3=arr[0];
        for(int i=1;i<arr.length;i++){

            temp1=Math.max(currmax*arr[i],currmin*arr[i]);
            temp2 = Math.min(currmax * arr[i],currmin*arr[i]);

            currmax=Math.max(arr[i],temp1);                // for calculating the max of the taken three values
            currmin = Math.min(arr[i],temp2);                // for calculating the min of the taken three values

            temp3=Math.max(currmax,currmin);
            maxsofar=Math.max(temp3,maxsofar);
        }
        System.out.print("The maximum subarray product is: "+maxsofar);
    }
}
