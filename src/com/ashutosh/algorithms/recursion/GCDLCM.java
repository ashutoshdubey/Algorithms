package com.ashutosh.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by dell on 11/5/2015.
 */
public class GCDLCM{

    static int GCD(int x,int y){
        if ( x==y){
            return x;
        }else if (x==1 || y==1){
            return 1;
        }
        if(x%y!=0){
            return GCD(y,x%y);
        }else return y ;
    }
    static int LCM(int x,int y){
        if(x==y || x%y==0)return x;
        else{
            return (x*y)/GCD(x,y);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==0||y==0){
            System.out.println("Their GCD is: 0 ");
        }else {

            System.out.println("Their GCD is: " + GCD(Math.max(x,y),Math.min(x,y)));
        }

        if(x==0||y==0){
            System.out.println("Their LCM is: 0 ");
        }else {

            System.out.println("Their LCM is: " + LCM(x,y));
        }

    }
}