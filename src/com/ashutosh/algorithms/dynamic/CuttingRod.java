package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */

//Determine the maximum value obtainable by cutting up the rod and selling the pieces

//cutRod(n) = max(price[i] + cutRod(n-i-1)) for all i in {0, 1 .. n-1}
public class CuttingRod {
    static int usingRecursion1(int []val,int n) {
        if (n <= 0) return 0;
        int max_val=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            max_val = Math.max(max_val, val[i] + usingRecursion1(val, n - i - 1));
        }
        return max_val;
    }
    static int usingDynamic1(int []val,int n){
        int dyn[]=new int[n+1];
        dyn[0]=0;
        int max_value;
        for(int i=1;i<=n;i++){
            max_value=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                max_value=Math.max(max_value,val[j]+dyn[i-j-1]);
            }
            dyn[i]=max_value;
        }
        return dyn[n];
    }
    static int usingRecursion2(int []val,int n,int k) {
        if (n <= 0 ||k<=0) return 0;
        return Math.max( val[n-1] +usingRecursion2(val, k - n, k - n),usingRecursion2(val, n - 1, k));
    }
    static int usingDynamic2(int []val,int n) {
        int dyn[][]=new int [n+1][n+1];
        for(int i=0;i<=n;i++){
            dyn[i][0]=0;
            dyn[0][i]=0;
        }
        for(int j=1;j<=n;j++){          //keeping array elements in rows
            for(int i=1;i<=j;i++){      //for each sum=k=j check for all the array elements
                dyn[j][i]=Math.max(val[i-1]+dyn[j-i][j-i],dyn[j][i-1]);
            }
        }
        return dyn[n][n];
    }

    public static void main(String args[]){
        int val[] = {3,5,8,9,10,17,17,20};//{1, 5, 8, 9, 10, 17, 17, 20};
        //int ans=usingRecursion2(val,val.length,val.length);
        int ans=usingDynamic2(val, val.length);
        System.out.print("Maximum possible value  is: " + ans);
    }
}
