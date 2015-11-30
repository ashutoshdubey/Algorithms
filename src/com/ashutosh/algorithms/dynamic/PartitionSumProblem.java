package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/25/2015.
 */
//whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.

public class PartitionSumProblem {
    static boolean isSubsetsum(int []arr,int sum,int n){
        if(sum==0)return true;
        if(n==0 && sum!=0)return false;
        if(arr[n-1]>sum)return isSubsetsum(arr,sum,n-1);
        else{
            return isSubsetsum(arr,sum,n-1) ||isSubsetsum(arr,sum-arr[n-1],n-1);
        }
    }

    //Dynamic programming solution of this can be constructed similar to subset sum problem
    static boolean subsetUsingDynamic(int []arr, int sum){      //using dynamic programming
        boolean dyn[][]=new boolean[sum+1][arr.length+1];
        for (int i=0;i<=arr.length;i++){
            dyn[0][i]=true;
        }
        for(int i=1;i<=sum;i++){
            dyn[i][0]=false;
        }

        for(int i=1;i<=sum;i++){
            for(int j=1;j<=arr.length;j++){
                dyn[i][j]=dyn[i][j-1];
                if(arr[j-1]<=i){
                    dyn[i][j]=dyn[i][j]||dyn[i-arr[j-1]][j];
                }
            }
        }
        return dyn[sum][arr.length];
    }

    public static void main(String args[]){
        int [] arr={3, 1, 5, 9, 12};
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2!=0)System.out.print("No two subsets with equal sum");
        else {
            //if (isSubsetsum(arr, sum/2, n)) System.out.print("Yes there exist two subsets with equal sum");
            if (subsetUsingDynamic(arr, sum/2)) System.out.print("Yes there exist two subsets with equal sum");

        }
    }
}
