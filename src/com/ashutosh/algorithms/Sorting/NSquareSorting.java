package com.ashutosh.algorithms.Sorting;

/**
 * Created by dell on 12/1/2015.
 */
public class NSquareSorting {

    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
        return;
    }

    static void selectionSort(int arr[]){
        int maxindex;
        for(int i=arr.length-1;i>0;i--){
            maxindex=0;
            for(int j=1;j<=i;j++){
                if(arr[j]>arr[maxindex]){
                    maxindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxindex];
            arr[maxindex]=temp;
        }
        printArray(arr);
        return;
    }
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
        return;
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[]={5,9,4,13,1,6,12,3,2};
        //insertionSort(arr);
        //selectionSort(arr);
        bubbleSort(arr);
    }
}
