package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.util.*;
import java.io.*;

class JavaMap{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name.toLowerCase(), phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer phone=map.get(s);
            if(phone==null)System.out.println("Not found");
            else System.out.println(s+"="+phone);
        }
    }
}