package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String line = sc.nextLine();
        char arr[] = line.toCharArray();
        int let[]=new int[26];
        for(int i=0;i<26;i++)let[i]=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if ((int)arr[i]<=122 && (int)arr[i]>=97 ){
                let[(int)(arr[i]-97)]=1;
            }else if((int)arr[i]<=90&& (int)arr[i]>=65){
                let[(int)(arr[i]-65)]=1;
            }

        }
        int flag=-1;
        for(int i=0;i<26;i++){
            if(let[i]==0){
                flag=0;
                break;
            }
        }
        if(flag==0)System.out.println("not pangram");
        else System.out.println("pangram");

    }
}