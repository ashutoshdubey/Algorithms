package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        //Write your code here
        for(int i=1 ;i<n;i++){
            for(int j=i ;j>0 && new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0 ;j--){
                String temp=s[j];
                s[j]=s[j-1];
                s[j-1]=temp;
            }

        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}