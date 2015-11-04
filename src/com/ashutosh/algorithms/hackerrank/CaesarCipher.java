package com.ashutosh.algorithms.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;


public class CaesarCipher {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String str=sc.next();
        char arr[]= str.toCharArray();
        int k =sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>=65 && arr[i] <=90)
                arr[i]= (char) ((arr[i]-65+k)%26 + 65);
            else if(arr[i]>=97 && arr[i] <=122){
                arr[i]= (char) ((arr[i]-97+k)%26 + 97);
            }

        }
        System.out.println(String.valueOf(arr));
    }
}
