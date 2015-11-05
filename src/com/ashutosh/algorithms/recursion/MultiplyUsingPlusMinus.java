package com.ashutosh.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by dell on 11/5/2015.
 */
public class MultiplyUsingPlusMinus {

    static int multiply(int x,int y){
        if(x==1)return y;
        if(y==1)return x;
        else{
            return x+multiply(x,y-1);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers to multiply: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==0||y==0){
            System.out.print("Their product is: 0 ");
        }else {

            System.out.print("Their product is: " + multiply(x,y));
        }
    }
}
