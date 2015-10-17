package com.ashutosh.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by dell on 10/17/2015.
 */
public class FibonacciMemoisation {
    public static  void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the value of n:");
        int n= sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=-1;
        }

        fibonacci(A,n);

        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }

    }
    public static int fibonacci(int []A,int n){
        if(n==1){
            A[0]=0;
            return 0;
        }else if(n==2){
            A[1]=1;
            return 1;
        }else{
            A[n-1]=find(A,n-2)+find(A,n-3);
            return A[n-1];
        }

    }

    public static int find(int []A,int x){
        if(A[x]==-1){
         A[x]= fibonacci(A,x+1);
        }
        return A[x];
    }
}
