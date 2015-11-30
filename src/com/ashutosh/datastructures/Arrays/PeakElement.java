package com.ashutosh.datastructures.Arrays;

/**
 * Created by dell on 11/26/2015.
 */
public class PeakElement {
    static int findPeak(int []arr,int low,int high,int n){
        int mid=(low+high)/2;
        if((mid==0 ||arr[mid]>=arr[mid-1] )&&(mid==n-1 || arr[mid]>=arr[mid+1])){
            return mid;
        }else if(mid>0 && arr[mid]<arr[mid-1]){
            return findPeak(arr,low,mid-1,n);
        }else {
            return findPeak(arr,mid+1,high,n);
        }

    }

    public static void main(String args[]){
        int arr[] = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is " +
                findPeak(arr,0,n-1, n));

    }
}
