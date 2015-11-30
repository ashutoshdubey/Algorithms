package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */
public class KnapSack {
    static int usingRecursion(int []val,int []wt,int n,int W){
        if(W==0 || n==0)return 0;
        if(W<wt[n-1]){
            return usingRecursion(val,wt,n-1,W);
        }else {
            return Math.max(val[n-1]+usingRecursion(val, wt, n - 1,W - wt[n - 1]), usingRecursion(val, wt, n - 1, W));
        }
    }
    static int usingDynamic(int []val,int []wt,int n,int W){
        int ks[][]=new int[W+1][n+1];

        for(int i=0;i<=W;i++){
            for(int j=0;j<=n;j++){
               if(i==0||j==0)ks[i][j]=0;
               else if(i<wt[j-1]){
                   ks[i][j]=ks[i][j-1];
               }else{
                   ks[i][j]=Math.max(val[j-1]+ks[i-wt[j-1]][j],ks[i][j]);
               }
            }
        }
        return ks[W][n];
    }

    public static void main(String args[]){
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W=50;
        //int ans=usingRecursion(val,wt,val.length,W);
        int ans=usingDynamic(val,wt,val.length,W);
        System.out.print("Maximum possible value of the knapsack is: " + ans);
    }
}
