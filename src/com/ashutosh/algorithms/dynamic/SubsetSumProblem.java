package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/23/2015.
 */

// Find if there is a subset with given sum
public class SubsetSumProblem {                         //using recursion
    static boolean ifEqualSum(int arr[],int n,int sum){
        if (sum==0)return true;
        if(n==0 && sum!=0)return false;
        if(arr[n-1]>sum)return ifEqualSum(arr,n-1,sum);

        return ifEqualSum(arr,n-1,sum-arr[n-1])||ifEqualSum(arr,n-1,sum);
    }
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
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum=10;
        if(subsetUsingDynamic(arr,sum))System.out.print("Yes there exists a subset with the given sum");
        else System.out.print("No there does not exist a subset with the given sum");

    }
}
