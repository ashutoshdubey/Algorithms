package com.ashutosh.datastructures.arrays;

/**
 * Created by dell on 11/21/2015.
 */

// leader is the element greater than all the elements to its right
public class LeadersInArray {
    public static void main(String args[]){
        int arr[]={1,7,5,3,-1,2,1};
        int maxi=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>maxi){
                System.out.print(" "+arr[i]);
                maxi=arr[i];
            }
        }
    }
}
