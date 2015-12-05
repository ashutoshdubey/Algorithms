package com.ashutosh.datastructures.arrays;

/**
 * Created by dell on 11/30/2015.
 */
//A number is called ugly if it has 2,3,5 as only prime factors
public class UglyNumbers {
    static int maxDivide(int a,int b){
        while (a%b == 0)
            a = a/b;
        return a;
    }
    static boolean isUgly(int i){
        i = maxDivide(i, 2);
        i = maxDivide(i, 3);
        i = maxDivide(i, 5);
        if(i==1)return true;
        else return false;
    }
    static int printUgly(int n){
        int i=1,count=1;
        while(n>count){
            i++;
            if(isUgly(i))count++;
        }
        return i;
    }

    public static void main(String args[]){
        System.out.print("The required ugly number is: "+ printUgly(150));//prints the 150th ugly number
    }
}
