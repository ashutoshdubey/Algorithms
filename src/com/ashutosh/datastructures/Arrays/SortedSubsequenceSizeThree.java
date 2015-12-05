package com.ashutosh.datastructures.arrays;

/**
 * Created by dell on 11/25/2015.
 */

//Find a sorted subsequence of size 3 in linear time

public class SortedSubsequenceSizeThree {

    static void findThreeNumbers(int []arr){
        int small[]=new int[arr.length];     //small[i] stores index of element smaller than arr[i]
        int large[]=new int[arr.length];     // large[i] stores index of element larger than arr[i];
        int min=0;    //index of the element smaller than arr[i];
        int n=arr.length;
        small[0]=-1;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[min]){
                min=i;
                small[i]=-1;
            }else{
                small[i]=min;
            }
        }
        int max=n-1;
        large[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[max]){
                max=i;
                arr[max]=-1;
            }else{
                large[i]=max;
            }
        }
        int flag=1;
        for(int i=0;i<n;i++){
            if(small[i]!=-1 && large[i]!=-1){
                System.out.print("The three numbers are: "+arr[small[i]]+" "+arr[i]+" "+ arr[large[i]]);
                flag=1;
                break;
            }
        }
        if(flag==0)System.out.print("No such triplets exist");
    }

    public static void main(String args[]){
        int arr[]={12, 11, 10, 5, 6, 2, 30};
        findThreeNumbers(arr);
    }
}
