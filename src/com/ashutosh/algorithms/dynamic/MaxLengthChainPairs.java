package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */
//A pair (c, d) can follow another pair (a, b) if b < c
//Find the longest chain which can be formed from a given set of pairs



public class MaxLengthChainPairs {
    public static class Pairs{
        int a;
        int b;
        Pairs(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    //This function assumes that arr[] is sorted in increasing order else use a comparator and sort
    static int usingDynamic(Pairs []arr,int n) {
        int dyn[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dyn[i] = 1;
        }
        for (int  i = 1; i < n; i++ ) {
            for (int j = 0; j < i; j++) {
                if (arr[i].a > arr[j].b && dyn[i] < dyn[j] + 1){
                    dyn[i] = dyn[j] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (max < dyn[i]) max = dyn[i];
        }
        return max;
    }

    public static void main(String args[]){
        Pairs []arr={new Pairs(5,24),new Pairs(15,25),new Pairs(27,40),new Pairs(50,60)};
        int ans=usingDynamic(arr,arr.length);
        System.out.print("Length of maximum size chain is: "+ans);

    }
}
