package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 12/4/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Alice wants to give at least 1 candy to each child.
// If two children sit next to each other, then the one with the higher rating must get more candies.
// minimize the total number of candies given to the children.

public class CandyDistribution{
    static int usingDP(int candy[]){
        int givencandy[]=new int[candy.length];
        for(int i=0;i<candy.length;i++)givencandy[i]=1;
        for(int i=1;i<candy.length;i++){
            if(candy[i]>candy[i-1])givencandy[i]=givencandy[i-1]+1;
        }
        for(int i=candy.length-2;i>=0;i--){
            if(candy[i]>candy[i+1] && givencandy[i]>givencandy[i+1]){}
            if(candy[i]>candy[i+1] && givencandy[i]<=givencandy[i+1]){
                givencandy[i]=givencandy[i+1]+1;
            }
        }

        int sum=0;
        for(int i=0;i<candy.length;i++)sum+=givencandy[i];
        return sum;
    }

    public static void main(String[] args) {

        int candy[]={1,2,2};
        System.out.print("The total number of candies given is"+usingDP(candy));
    }
}