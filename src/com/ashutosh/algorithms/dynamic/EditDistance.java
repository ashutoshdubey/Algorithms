package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/26/2015.
 */

//Given two strings str1 and str2 and below operations that can performed on str1.
// Find minimum number of edits (operations) required to convert ‘str1? into ‘str2?.

public class EditDistance {
    static int usingRecursion(char[]A,int n1,char[]B,int n2){
        if(n1==0)return n2;
        if(n2==0)return n1;
        if(A[n1-1]==B[n2-1]){
            return usingRecursion(A,n1-1,B,n2-1);
        }else{
            int temp=Math.min(usingRecursion(A,n1-1,B,n2),usingRecursion(A,n1,B,n2-1));
            return 1+ Math.min(temp,usingRecursion(A,n1-1,B,n2-1));
        }
    }
    static int usingDynamic(char[]A,int n1,char[]B,int n2){
        int length[][]=new int[n1+1][n2+1];

        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                if(i==0)length[i][j]=j;
                else if(j==0)length[i][j]=i;
                else if(A[i-1]==B[j-1]){
                    length[i][j]=length[i-1][j-1];
                }else{
                    int temp=Math.min(length[i][j-1],length[i-1][j]);
                    length[i][j]=1+ Math.min(temp,length[i-1][j-1]);
                }
            }
        }
        return length[n1][n2];
    }

    public static void main(String args[]){
        char X[] = {'s','u','n','d','a','y'};               //sunday
        char Y[] = {'s','a','t','u','r','d','a','y'};       //saturday
        //int ans=usingRecursion(X,X.length,Y,Y.length);
        int ans=usingDynamic(X,X.length,Y,Y.length);
        System.out.print("Minimum edits required is: " + ans);
    }
}
