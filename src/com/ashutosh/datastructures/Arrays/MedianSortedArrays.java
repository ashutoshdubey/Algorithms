package com.ashutosh.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by dell on 11/21/2015.
 */
public class MedianSortedArrays {

    static int getMedian(int arr1[],int[]arr2,int first1,int last1,int first2,int last2){
        int m1,m2;
        int n=last1-first1 +1;
        if (n <= 0)
            return -1;
        if (n == 1)
            return (arr1[first1] + arr2[first2])/2;
        if (n == 2)
            return (Math.max(arr1[first1], arr2[first2]) + Math.min(arr1[last1], arr2[last2])) / 2;
        m1=median(arr1,first1,last1);
        m2=median(arr2,first2,last2);
        if(m1==m2)return m1;
        if(m1>m2){
            if(n%2==0){
                return getMedian(arr1,arr2,first1,n/2-1,n/2,last1);
            }else{
                return getMedian(arr1,arr2,first1,n/2,n/2,n-1);
            }

        }else{
            if(n%2==0){
                return getMedian(arr2,arr1,first1,n/2-1,n/2,n-1);

            }else{
                return getMedian(arr2,arr1,first1,n/2,n/2,n-1);
            }
        }

    }
    static int median(int []arr,int first,int last){
        int n=last-first+1;
        if (n%2 == 0)
            return (arr[first+n/2] + arr[first + n/2-1])/2;
        else
            return arr[first+ n/2];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar1[] = {1, 2, 3, 6};
        int ar2[] = {4,7, 8, 10};
        int n1= ar1.length;
        int n2 = ar2.length;
        if (n1 == n2)
            System.out.print("Median is: "+ getMedian(ar1,ar2,0,n1-1,0,n2-1));
        else
            System.out.print("Doesn't work for arrays of unequal size");
    }
}
