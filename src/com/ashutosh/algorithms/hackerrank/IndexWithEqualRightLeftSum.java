package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/7/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IndexWithEqualRightLeftSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            int []arr=new int[n];
            int sum=0;

            boolean flag=false;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            int ls=0;
            int rs=sum;

            for(int i=0;i<n;i++ ){
                rs-=arr[i];
                if(rs==ls){
                    flag=true;
                    break;
                }else{
                    ls+=arr[i];
                }


            }
            if(flag==true)System.out.println("YES");
            else System.out.println("NO");

            t--;
        }

    }
}