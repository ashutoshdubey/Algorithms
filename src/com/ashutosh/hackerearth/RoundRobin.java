package com.ashutosh.hackerearth;

/**
 * Created by dell on 1/4/2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class RoundRobin {

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int arr[]=new int[n+1];
        long totaltime=0;
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
            totaltime+=arr[i];
        }

        int rank[]=new int[n+1];
        long time[]=new long[n+1];
        for(int k=1;k<=n;k++){
            time[k]=-1;
        }
        int status=1;
        for(long j=0;j<totaltime;){
            for(int i=1;i<=n;i++){
                if(time[i]==-1){
                    time[i]=j;
                }
                if(arr[i]>0){
                    if(arr[i]>c){
                        arr[i]-=c;
                        j+=c;
                    }else{
                        j+=arr[i];
                        arr[i]=0;
                        rank[i]=status;
                        status++;
                    }
                }
            }
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int mode=sc.nextInt();
            int task=sc.nextInt();
            if(mode==1){
                System.out.println(time[task]);
            }else{
                System.out.println(rank[task]);
            }

        }

    }
}
