package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/26/2015.
 */

//Given a value N, if we want to make change for N cents,
// and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change?

public class CoinChange {

    static int usingRecursion(int []arr,int n,int total){
        if (total==0)return 1;
        else if(total<0)return 0;
        else if(n<=0 && total>0){
            return 0;
        }
        else{
           return usingRecursion(arr,n-1,total)+usingRecursion(arr,n,total-arr[n-1]);
        }
    }
    static int usingDynamic(int arr[],int n,int total){
        int dyn[][]=new int[total+1][n+1];
        for(int i=0;i<=n;i++){       //when total==0 and n can be anything
            dyn[0][i]=1;
        }
        for(int i=1;i<=total;i++){   //when total is grater than 0 and n==0
            dyn[i][0]=0;
        }

        for(int i=1;i<=total;i++){
            for(int j=1;j<=n;j++){
                if(i<arr[j-1]){
                    dyn[i][j]=dyn[i][j-1];
                }else {
                    dyn[i][j] = dyn[i][j - 1] + dyn[i-arr[j-1]][j];
                }
            }
        }
        return dyn[total][n];
    }


    public static void main(String args[]){

        int arr[] = {1, 2, 3};
        int total=5;
        //int ans=usingRecursion(arr,arr.length,total);          //using recursive approach
        int ans=usingDynamic(arr,arr.length,total);          // using dynamic
        System.out.print("Total ways to get change is: " +ans);
    }
}
