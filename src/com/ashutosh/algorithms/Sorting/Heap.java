package com.ashutosh.algorithms.Sorting;

/**
 * Created by dell on 12/1/2015.
 */
public class Heap {
    static void heapify(int arr[],int i,int n){   //construction of minheap // takes logn complexity
        int pos=i;
        int val=arr[i];
        if(2*i<=n && arr[2*i]<val){
            pos=2*i;
            val=arr[2*i];
        }
        if(2*i+1<=n && arr[2*i+1]<val){
            pos=2*i+1;
        }
        if(pos!=i){
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
            heapify(arr,pos,n);
        }
    }

    public static void main(String args[]){
        int arr[]={0,5,9,4,13,1,6,12,3,2};   //not considering first element
        int n=arr.length-1;                   //since we are considering array from 1th index
        for(int i=n/2;i>=1;i--) {
            heapify(arr,i, n);
        }
        for(int i=0;i<n;i++) {                  //heapsort takes nlogn time
            System.out.print(arr[1]+" ");
            int temp=arr[1];
            arr[1]=arr[n-i];
            arr[n-i]=temp;
            heapify(arr,1,n-1-i);
        }
    }
}
