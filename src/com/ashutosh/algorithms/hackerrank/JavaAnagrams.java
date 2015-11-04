package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String A, String B) {
        char a[]=A.toCharArray();
        char b[]=B.toCharArray();
        int let []=new int[26];
        for(int i=0;i<26;i++)let[i]=0;
        int flag=0;
        if(a.length!=b.length)return false;
        else {
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
                if(let[i]!=0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)return true;
            else return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}