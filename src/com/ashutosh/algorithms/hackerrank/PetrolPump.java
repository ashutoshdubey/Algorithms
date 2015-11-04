package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PetrolPump{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []petrol=new int[n];
        int []distance=new int[n];
        int sum[]=new int[n];

        for(int i=0;i<n;i++){
            petrol[i]=sc.nextInt();
            distance[i]=sc.nextInt();
            sum[i]=0;
        }

        int count=0;
        int i;
        for(i=0;i<n;i++){
            sum[i]=0;
            for(int j=i;j<i+n;j++){
                sum[i]+=petrol[j%n]-distance[j%n];
                if(sum[i]<0)break;
            }
            if(sum[i]>0)break;

        }

        System.out.println(i);

    }
}