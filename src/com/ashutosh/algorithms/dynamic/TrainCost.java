package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 12/1/2015.
 */

//he train goes from station 0 to N-1. The ticket cost for all pair of stations (i, j) is given where j is greater than i.
// Find the minimum cost to reach the destination

//can also be done using dikshtra
public class TrainCost {
    static int usingRecursion(int cost[][],int start,int last){
        if(start==last || last==start+1)return cost[start][last];
        int min=cost[start][last];
        for(int i=start+1;i<last;i++){
             int temp=usingRecursion(cost,start,i)+usingRecursion(cost,i,last);
            if(temp<min)min=temp;
        }
        return min;
    }
    static int usingDynamic(int cost[][],int size){
        int dyn[]=new int[size];
        for (int i=0; i<size; i++) {
            dyn[i] = Integer.MAX_VALUE;
        }
            dyn[0] = 0;
        //using bottom up approach
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(dyn[j]>dyn[i]+cost[i][j])dyn[j]=dyn[i]+cost[i][j];
            }
        }
        return dyn[size-1];
    }
    public static void main(String args[]){
        {
            int cost[][] = { {0, 15, 80, 90},
            {Integer.MAX_VALUE, 0, 40, 50},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 70},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}};

            //int ans=usingRecursion(cost, 0, cost.length - 1);
            int ans=usingDynamic(cost,cost.length);
            System.out.print( "The Minimum cost to reach station: "+ans);
        }
    }
}
