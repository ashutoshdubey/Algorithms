package com.ashutosh.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by dell on 11/5/2015.
 */
public class Factorial {

    static int fact(int x){
        if(x==1)return 1;
        else{
            return x*fact(x-1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("The factorial of the number is: " + fact(n));
    }
}
