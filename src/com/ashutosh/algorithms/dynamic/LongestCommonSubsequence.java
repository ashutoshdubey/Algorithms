package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/26/2015.
 */
public class LongestCommonSubsequence {

    static int usingRecursion(char[]A,int n1,char[]B,int n2){
        if(n1==0 ||n2==0 )return 0;
        if(A[n1-1]==B[n2-1]){
            return 1+usingRecursion(A,n1-1,B,n2-1);
        }else{
            return Math.max(usingRecursion(A,n1-1,B,n2),usingRecursion(A,n1,B,n2-1));
        }
    }
    static int usingDynamic(char[]A,int n1,char[]B,int n2){
        int length[][]=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            length[i][0]=0;
        }
        for(int i=1;i<=n2;i++){
            length[0][n2]=0;
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(A[i-1]==B[j-1]){
                    length[i][j]=1+length[i-1][j-1];
                }else{
                    length[i][j]=Math.max(length[i][j-1],length[i-1][j]);
                }
            }
        }
        return length[n1][n2];
    }

    public static void main(String args[]){
        char X[] = {'A','G','G','T','A','B'};
        char Y[] = {'G','X','T','X','A','Y','B'};
        //int ans=usingRecursion(X,X.length,Y,Y.length);
        int ans=usingDynamic(X,X.length,Y,Y.length);
        System.out.print("Length of longest subsequence is: " + ans);

    }
}
