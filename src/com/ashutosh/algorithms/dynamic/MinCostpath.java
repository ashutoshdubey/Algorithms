package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/26/2015.
 */

//Given a cost matri find the minimum cost to reach the right bottom corner where cost[i][j] represents the cost of passing through i,j

public class MinCostpath {
    static int usingRecursion(int [][]A,int n1,int n2){
        if(n1<0 || n2<0)return Integer.MAX_VALUE;
        else if(n1==0 && n2==0){
            return A[n1][n2];
        }else{
            int temp=Math.min(usingRecursion(A,n1,n2-1),usingRecursion(A,n1-1,n2));
            return A[n1][n2]+ Math.min(temp,usingRecursion(A,n1-1,n2-1));
        }
    }
    static int usingDynamic(int [][]A,int n1,int n2){
        int length[][]=new int[n1][n2];
        length[0][0]=A[0][0];
        for(int i=1;i<n1;i++){
            length[0][i]=A[0][i]+length[0][i-1];
        }
        for(int i=1 ;i<n2;i++){
            length[i][0]=A[i][0]+ length[i-1][0];
        }
        for(int i=1;i<n1;i++){
            for(int j=1;j<n2;j++){
                int temp=Math.min(length[i][j-1],length[i-1][j]);
                length[i][j]=A[i][j]+ Math.min(temp,length[i-1][j-1]);
            }
        }
        return length[n1-1][n2-1];
    }

    public static void main(String args[]){
        int cost[][] = { {1, 2, 3},{4, 8, 2},{1, 5, 3} }; //cost matrix
        //int ans=usingRecursion(cost,cost.length-1,cost[0].length-1);
        int ans=usingDynamic(cost,cost.length,cost[0].length);
        System.out.print("Minimum cost to reach the end is: " + ans);
    }
}
