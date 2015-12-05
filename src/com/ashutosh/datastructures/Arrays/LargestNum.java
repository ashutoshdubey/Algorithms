package com.ashutosh.datastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dell on 11/26/2015.
 */
//Arrange given numbers to form the biggest number
public class LargestNum {
    static Comparator myCompare=new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o2+""+o1).compareTo(o1+""+o2);
        }
    };
    public static void main(String args[]){
        Integer arr[]={1, 34, 3, 98, 9, 76, 45, 4};
        Arrays.sort(arr,myCompare);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
