package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> list =new ArrayList<Integer>();
            for(int j=0;j<d;j++){
                list.add(sc.nextInt());
            }
            list1.add(list);
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<=n && y <= list1.get(x-1).size()){
                System.out.println(list1.get(x-1).get(y-1));
            }else{
                System.out.println("ERROR!");
            }

        }

    }
}