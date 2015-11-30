package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */

// minimize the worst case number of trials needed to find the threshold floor from where egg wont break
public class EggBreak {
    static int usingRecursion(int k,int n){
        if(k==0 || k==1)return k;         //if no floor then no trial needed and if one floor then one trial needed
        if(n==1)return k;

        int min=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            int res=Math.max(usingRecursion(i-1,n-1), usingRecursion(k-i,n)); //if egg breaks at ith floor then try n-1 eggs with i-1 floors
            if(res<min)min=res;                                               //else try n eggs for n-i floors
        }
        return min+1;
    }
    static int usingDynamic(int k,int n) {
        int trial[][] = new int[k+1][n + 1];        //trial[i][j] will represent minimum number of trials needed for i eggs and j floors
        for (int i = 1; i <= n; i++) {            // We need one trial for one floor and0 trials for 0 floors
            trial[1][i] = 1;
            trial[0][i] = 0;
        }
        for (int j = 1; j <= k; j++){
            trial[j][1] = j;
        }
        for(int i=2;i<=n;i++){
            for(int j=2;j<=k;j++){                  //floor size
                trial[j][i]=Integer.MAX_VALUE;
                for(int x=1;x<=j;x++) {
                    int res = 1 + Math.max(trial[x - 1][i - 1], trial[j-x][i]);
                    if (trial[j][i] > res) trial[j][i] = res;
                }
            }
        }
        return trial[k][n];
    }
    static int trick(int k){
        int a = (-1+(int)Math.sqrt(1+8*k))/2;
        int b=(-1-(int)Math.sqrt(1+8*k))/2;
        if(a>0)return a;
        else return b;
    }

    public static void main(String args[]){
        int n=2;                                          //number of eggs allowed
        int k=10;                                         //number f floors
        //int ans=usingRecursion(k,n);
        int ans=usingDynamic(k,n);
        //int ans=trick(k);
        System.out.print("Minimum number of trials in the worst case is: " + ans);
    }
}
