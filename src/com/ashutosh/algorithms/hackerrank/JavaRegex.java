package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


class myRegex {             /*My part of the code*/
    String pattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}

class JavaRegex{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}