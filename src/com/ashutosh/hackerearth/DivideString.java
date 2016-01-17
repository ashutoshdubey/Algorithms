package com.ashutosh.hackerearth;

/**
 * Created by dell on 1/4/2016.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DivideString {

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++) {

            String str=sc.next();
            if(str.length()>=10)System.out.println("YES");
            else {
                boolean flag=false;
                for (int i = 1; i < str.length()-2; i++) {
                    for (int j = i+1; j < str.length()-1; j++) {
                        for (int k = j + 1; k < str.length();k++) {
                            String s1=str.substring(0,i);
                            String s2=str.substring(i,j);
                            String s3=str.substring(j,k);
                            String s4=str.substring(k);
                            if(!s1.equals(s2)&& !s1.equals(s3)&& !s1.equals(s4)&& !s2.equals(s3)&& !s2.equals(s4)&& !s3.equals(s4)){
                                flag=true;
                            }

                        }

                    }
                }
                if(flag)System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
