package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaTryCatch{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);


        try {
            int x=sc.nextInt();
            int y=sc.nextInt();

            System.out.println((int)x/y);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch (Exception e) {
            System.out.println(e);

        }

    }

}