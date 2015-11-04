package com.ashutosh.algorithms.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[][]=new char [n][n];
        for (int i = 0; i < n; i++)
        {
            String lines = sc.next();
            arr[i] = lines.toCharArray();
        }

        for (int i = 1; i < n-1; i++)
        {
            for(int j = 1; j < n-1; j++)
            {
                if((arr[i][j] > arr[i-1][j]) && (arr[i][j] > arr[i+1][j]) && (arr[i][j] > arr[i][j-1]) && (arr[i][j] > arr[i][j+1]))
                    arr[i][j] = 'X';
            }
        }
        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}