package com.ashutosh.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by dell on 10/17/2015.
 */
public class TowerofHanoi {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the value of n:");
        int n= sc.nextInt();
        char source='a' ,aux='b',dest='c';
        Hanoi(n,source,aux,dest);
    }

    public static void Hanoi(int n,char source,char aux, char dest){
        if(n==1){
            System.out.println("Moving disk 1 from  " +source+" to  " +dest);
            return;
        }
        Hanoi(n-1,source,dest,aux);
        System.out.println("Moving disk " +n+ " from " +source+" to  " +dest);
        Hanoi(n-1,aux,source,dest);

    }
}
