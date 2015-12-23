package com.ashutosh.algorithms.strings;

/**
 * Created by dell on 12/23/2015.
 */
//takes O(n) i worst case
public class KMPSearch {
    static void KMPSearchalgo(char []pat,char []txt){
        int m=pat.length;
        int n=txt.length;
        int []lps=new int[m];
        int j=0;
        computeLPSArray(pat,lps);
        int i=0;
        while(i<n){
            if(pat[j]==txt[i]){
                i++;
                j++;
            }
            if(j==m){
                System.out.print("Pattern found at index: "+(i-j));
                j=lps[j-1];
            }
            else if(i < n && pat[j] != txt[i]){
                if(j==0){
                    i++;
                }else{
                    j=lps[j-1];
                }
            }

        }
    }
    static void computeLPSArray(char []pat,int []lps){
        int length=0;
        lps[0]=0;
        for(int i=1;i<lps.length;i++){
            if(pat[i]==pat[length]){
                length++;
                lps[i]=length;
            }else {
                if(length!=0){
                    lps[i]=lps[length-1];
                }else{
                    lps[i]=0;
                }
            }
        }
    }
    public static void main(String args[]){

        String txt= "ABABDABACDABABCABAB";
        String pat= "ABABCABAB";
        KMPSearchalgo(pat.toCharArray(), txt.toCharArray());
    }
}
