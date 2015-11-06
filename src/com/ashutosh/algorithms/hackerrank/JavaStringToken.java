package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
import java.io.*;
import java.util.*;



public class JavaStringToken {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String answer[]={};

        if( s != null && !s.trim().isEmpty() && s.trim().length() <= 400000){
            answer=s.trim().split("[!,?.\\_ '@]+") ;
            System.out.println(answer.length);
            for(String j:answer)System.out.println(j);
        }else {
            System.out.println(0);
        }


    }
}
