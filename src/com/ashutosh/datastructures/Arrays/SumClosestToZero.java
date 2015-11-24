package com.ashutosh.datastructures.Arrays;

import java.util.Arrays;

/**
 * Created by dell on 11/22/2015.
 */
public class SumClosestToZero {

    public static void main(String args[]){
        int arr[]={1, 60, -10, 70, -80, 85};
        Arrays.sort(arr);
        int l =0;
        int r=arr.length-1;
        int min=arr[r]-arr[l];
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            if((arr[i]+arr[j])<min){
                min=arr[i]+arr[j];
                l=i;
                r=j;
            }

        }
        System.out.print("The two corresponding elements are: "+ arr[r] + " and "+arr[l]);



    }
}
