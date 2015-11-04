package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FiboBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a,b;
        int n;
        a=sc.next();
        b=sc.next();
        n=sc.nextInt();
        //BigInteger sample=new BigInteger("0");
        BigInteger first=new BigInteger(a);
        BigInteger second=new BigInteger(b);
        BigInteger nth=new BigInteger("0");

        for(int i=2;i<n;i++){
            nth=second.multiply(second);
            nth=nth.add(first);
            first=second;
            second=nth;
        }
        System.out.println(nth);

    }
}