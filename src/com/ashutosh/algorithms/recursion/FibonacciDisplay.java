package com.ashutosh.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by dell on 10/17/2015.
 */
public class FibonacciDisplay {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        FibonacciDisplay fd = new FibonacciDisplay();

        System.out.print("Please enter the value of n:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fd.fibo(i));
        }

    }
    public int fibo(int n){
        if(n==1)return 0;
        else if(n==2) return 1;
        else {

            return fibo(n-1)+fibo(n-2);
        }


    }


}
