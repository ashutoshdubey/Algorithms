package com.ashutosh.algorithms.hackerrank;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by dell on 11/4/2015.
 */
public class HourGlass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[6][6];

        for(int i=0;i<6;i++){
            for(int j=0 ;j<6;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        int sum=0;
        int max=-10000;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                sum=arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j+1];
                if(sum>=max)max=sum;
            }
        }

        System.out.println(max);

    }
}