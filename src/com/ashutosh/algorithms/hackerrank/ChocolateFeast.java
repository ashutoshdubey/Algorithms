package com.ashutosh.algorithms.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int N, int C, int M){


        int answer=0,total=0;
        answer=N/C;

        total=answer+((answer-1)/(M-1));
        return total;

    }

}
