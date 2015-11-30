package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/30/2015.
 */
// the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.

public class LongestPalindromicString {
    static void usingDynamic(char str[],int size){
        boolean table[][]=new boolean[size][size];
        int start=0;
        int maxLength=1;
        // table[i][j] will be false if substring str[i..j]
        // is not palindrome.
        // Else table[i][j] will be true
        for(int i=0;i<size;i++){
            table[i][i]=true;
        }
        for (int i = 0; i < size-1; i++)
        {
            if (str[i] == str[i+1])
            {
                table[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }
        int j;
        for(int l=3;l<=size;l++){
            for(int i=0 ;i<size-l+1;i++){
                j=i+l-1;                                            //lower diagonal values are not filled
                if(str[i]==str[j] && table[i+1][j-1]==true){
                    table[i][j]=true;
                    if(l>maxLength){
                        start=i;
                        maxLength=l;
                    }
                }
            }
        }
        System.out.print("The longest substring is: ");
        for(int i=start;i<start+maxLength;i++){
            System.out.print(str[i]);
        }
    }
    public static void main(String args[]){
        String str="forgeeksskeegfor";
        char arr[]=str.toCharArray();
        usingDynamic(arr, arr.length);
    }
}

