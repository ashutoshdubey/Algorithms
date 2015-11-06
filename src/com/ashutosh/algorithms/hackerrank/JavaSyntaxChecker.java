package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
import java.util.Scanner;
import java.util.regex.*;

public class JavaSyntaxChecker{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            PatternSyntaxException exc = null;
            try {
                Pattern.compile(pattern);

            }catch (PatternSyntaxException exception) {
                exc=exception;

            }
            if(exc==null)System.out.println("Valid");
            else System.out.println("Invalid");
        }
    }
}
