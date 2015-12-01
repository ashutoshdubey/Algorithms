package com.ashutosh.algorithms.Sorting;

/**
 * Created by dell on 12/1/2015.
 */
public class MergeSort {
    static void merge(int arr[],int first,int mid,int last){
        int size=last-first+1;
        int temp[]=new int[size];
        int i=first;
        int j=mid+1;
        int k;
        for(k=0;i<=mid && j<=last;k++){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=last){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<size;l++){
            arr[first+l]=temp[l];
        }
    }
    static void partition(int arr[],int first,int last){
        if(first<last) {
            int mid = (first + last) / 2;
            partition(arr, first, mid);
            partition(arr, mid + 1, last);
            merge(arr, first, mid, last);
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[]={5,9,4,13,1,6,12,3,2};
        partition(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
