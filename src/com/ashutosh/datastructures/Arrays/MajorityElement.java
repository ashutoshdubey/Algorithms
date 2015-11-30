package com.ashutosh.datastructures.Arrays;

import java.util.Scanner;

/**
 * Created by dell on 11/21/2015.
 */
// Code that prints the element that occurs most number of times
    //Moore’s Voting Algorithm
public class MajorityElement {
    static int getMajorityIndex(int []arr){
        int count=1;
        int majindex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[majindex])count++;
            else count--;
            if(count==0){
                majindex=i;
                count=1;
            }
        }
        return arr[majindex];
    }
    static int ifMajority(int []arr,int majelement){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==majelement)count++;
        }
        if(count>arr.length/2)return majelement;
        else return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int majindex=getMajorityIndex(arr);
        int result=ifMajority(arr,majindex);

        if(result!=-1)System.out.println("The majority element is "+ result);
        else System.out.print("No such number");
    }
}
