package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaPathGame {

    static boolean pathFinder(int []arr,int path,int m){
        if(path<0)return false;
        if(path>=arr.length)return true;
        if(arr[path]!=0){
            return false;
        }else{
            arr[path]=1;
            return pathFinder(arr,path+1,m)||pathFinder(arr,path-1,m)||pathFinder(arr,path+m,m);
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t,n,m,pos;

        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            int ar[] = new int[n];
            m=sc.nextInt();
            pos = 0;
            for(int j=0;j<n;j++)ar[j]=sc.nextInt();


            if(pathFinder(ar,pos,m))
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            t--;
        }


    }
}