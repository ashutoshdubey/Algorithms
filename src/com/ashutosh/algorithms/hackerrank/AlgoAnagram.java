package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/7/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgoAnagram {

    static int isAnagram(String A, String B) {
        char a[]=A.toCharArray();
        char b[]=B.toCharArray();
        int let []=new int[26];
        for(int i=0;i<26;i++)let[i]=0;

        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>=97 && a[i]<=122){
                let[a[i]-97]+=1;
            }else if(a[i]>=65 && a[i]<=90){
                let[a[i]-65]+=1;
            }
        }

        for(int i=0;i<b.length;i++){
            if(b[i]>=97 && b[i]<=122){
                let[b[i]-97]-=1;
            }else if(b[i]>=65 && b[i]<=90){
                let[b[i]-65]-=1;
            }
        }

        for(int i=0;i<26;i++){
            if(let[i]>0)count+=let[i];
        }
        return count;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans=0;
        while(t>0){
            String s=sc.next();
            int n=s.length();
            if(n%2!=0){
                ans=-1;
            }else{
                String first=s.substring(0,n/2);
                String second=s.substring(n/2 ,n);
                ans=isAnagram(first,second);
            }
            System.out.println(ans);
            t--;
        }

    }
}
