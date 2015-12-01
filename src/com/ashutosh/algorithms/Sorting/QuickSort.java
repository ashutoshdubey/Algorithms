package com.ashutosh.algorithms.Sorting;

/**
 * Created by dell on 12/1/2015.
 */
public class QuickSort {
    static void qSort(int arr[],int start,int end){
        int pivot;
        if(start<end){
            pivot=partition(arr,start,end);
            qSort(arr,start,pivot-1);
            qSort(arr,pivot+1,end);
        }
    }
    static int partition(int arr[],int start,int end){
        int pivotitem=arr[start];
        int left=start;
        int right=end;
        while(left<right){
            while(arr[left]<=pivotitem){
                left++;
            }
            while (arr[right]>pivotitem){
                right--;
            }
            if(left<right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
        arr[start]=arr[right];
        arr[right]=pivotitem;
        return right;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[]={5,9,4,13,1,6,12,3,2};
        qSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
