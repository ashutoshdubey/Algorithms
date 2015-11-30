package com.ashutosh.algorithms.dynamic;

import java.util.Scanner;

/**
 * Created by dell on 11/30/2015.
 */
public class WayToScore {

    static long score(int n,int a,int b,int c){
        if(n<0)return 0;
        if(n==0)return 1;
        else{
            return score(n-a,a,b,c)+score(n-b,a,b,c)+score(n-c,a,b,c);
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the final value to score: ");
        int n=sc.nextInt();
        System.out.print("Enter the three mini scores: ");
        int a=-1,b=-1,c=-1;

        while((a<0) || (b<0) || (c<0)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a<0|| b<0  || c<0){
                System.out.print("Invalid scores.Reenter the inputs: ");
            }
        }

        if(a>n && b>n && c>n){
            System.out.print("You cannot win it");
        }else{
            System.out.print("No of ways you can win it: " + score(n,a,b,c));
        }
    }
}