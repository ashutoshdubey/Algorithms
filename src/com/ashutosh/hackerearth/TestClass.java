package com.ashutosh.hackerearth;

/**
 * Created by dell on 1/2/2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String str=sc.next();
            int q=sc.nextInt();
            while(q>0){
                String a=sc.next();
                int count=0;
                for(int i=0;i<str.length();i++){
                    for(int j=i+1;j<=str.length();j++){
                        String b=str.substring(i,j);
                        if(b.contains(a))count++;

                    }
                }
                System.out.println(count);
                q--;
            }
            t--;
        }


    }
}

