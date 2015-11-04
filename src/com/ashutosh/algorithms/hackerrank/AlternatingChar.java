package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingChar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        char val;


        while(t>0){
            int count=0;
            String str=sc.next();
            char arr[]=str.toCharArray();
            int n=arr.length;
            val=arr[0];
            for(int i=1;i<n;i++){

                if(arr[i]==val)count++;
                else{
                    val=arr[i];
                }


            }
            System.out.println(count);


            t--;
        }

    }
}
