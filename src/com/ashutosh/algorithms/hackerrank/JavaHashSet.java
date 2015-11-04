package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashSet<String> h=new HashSet<String>();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            h.add(s);
            System.out.println(h.size()); // since hashset never stores duplicate values
        }

    }
}