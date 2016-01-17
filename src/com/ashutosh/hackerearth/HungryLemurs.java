package com.ashutosh.hackerearth;

/**
 * Created by dell on 1/4/2016.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HungryLemurs {

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans= Integer.MAX_VALUE;
        for(int i=1;i<1e6;i++){
            for(int j=0;j<1e6;j+=i){
                ans=Math.min(ans,Math.abs(i-K)+Math.abs(j-N));
            }
        }
        System.out.println(ans);
    }
}
