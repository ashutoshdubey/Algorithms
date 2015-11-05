package com.ashutosh.algorithms.strings;

import java.util.Scanner;

/**
 * Created by dell on 11/5/2015.
 */
public class ReverseSentence {

    static void reverseString(char arr[] , int x,int y){
        if(x==y){
            return ;

        }else if(y==x+1){
            char temp;
            temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            return ;

        }else{
            char temp;
            temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            reverseString(arr, x + 1, y - 1);
        }

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sentence you want to reverse: ");

        String line=sc.nextLine();
        char []arr=line.toCharArray();

        reverseString(arr,0,arr.length-1);

        int i=0;
        int j=0;

        for(j=0;i!=arr.length;){
            for(i=j; !(i==arr.length || arr[i]==' ');i++){ // check length first and then space
            }
            reverseString(arr,j,i-1);
            if(i!=arr.length){
                while(arr[i]==' ')i++;   // taking care of more than one spaces
                j=i;
            }
        }

        System.out.println("Your reversed sentence is: " + String.valueOf(arr));
    }
}

