package com.ashutosh.algorithms.Sorting;

/**
 * Created by dell on 12/1/2015.
 */
public class CountingSort {
    static void cSort(int arr[]){ //assuming the max value lies withing 15
        int count[]=new int [15];
        for(int i=0;i<15;i++)count[i]=0;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]+=1;
        }
        int sum=0;
        for(int i=0;i<15;i++){
            sum+=count[i];
            count[i]=sum;
        }
        int output[]=new int[15];
        for(int i=0;i<15;i++)output[i]=0;
        for(int i=0;i<arr.length;i++){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<15;i++){
            if(output[i]!=0)System.out.print(output[i]+" ");
        }

    }
    public static void main(String args[]){
        int arr[]={5,9,4,13,1,6,12,3,2};
        cSort(arr);
    }
}
