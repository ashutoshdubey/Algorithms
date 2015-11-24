package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/7/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgoPalindromeIndex {

    static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        if(i>=j)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            String s=sc.next();

            int front=0,last=s.length()-1,flag=-1;

            if(s.length()>1)
            {   while(front<last && s.charAt(front)==s.charAt(last))
            {
                front++;
                last--;
            }
                if(front>=last)
                    flag=-1;
                else{
                    if(isPalindrome(s.substring(front,last)))
                        flag=last;
                    else
                        flag=front;
                }
            }
            System.out.println(flag);
        }
    }
}
