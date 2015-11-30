package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */
//if the given sequence is “BBABCBCAB”, then the output should be 7 as “BABCBAB” is the longest palindromic sub sequence in it
//we need to return subsequence so it need not be contiguous
public class LongestPalindromicSequence {
    static int usingRecursion(char arr[],int first,int last){
        if(first==last)return 1;
        if(last==first+1 && arr[first]==arr[last])return 2;
        if(arr[first]==arr[last])return 2+usingRecursion(arr,first+1,last-1);
        else{
            return Math.max(usingRecursion(arr,first+1,last),usingRecursion(arr,first,last-1));
        }

    }
    static int usingDynamic(char arr[],int last){
        int dyn[][]=new int[last][last];
        for(int i=0;i<last;i++){
            dyn[i][i]=1;
        }
        int j=0;
        for(int l=2;l<=last;l++){
            for(int i=0 ;i<last-l+1;i++){
                j=i+l-1;                                            //lower diagonal values are not filled
                if(arr[i]==arr[j] && l==2)dyn[i][j]=2;
                else if(arr[i]==arr[j])dyn[i][j]=2+dyn[i+1][j-1];
                else{
                    dyn[i][j]=Math.max(dyn[i+1][j],dyn[i][j-1]);
                }
            }
        }
        return dyn[0][last-1];
    }
    public static void main(String args[]){
        char arr[]={'G','E','E','K','S','F','O','R','G','E','E','K','S'};
       // int ans=usingRecursion(arr,0,arr.length-1);
        int ans=usingDynamic(arr, arr.length - 1);
        System.out.print("Length of the longest palindromic subsequence is: "+ans);
    }
}
