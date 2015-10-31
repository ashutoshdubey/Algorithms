package com.ashutosh.algorithms.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int check(char[][] arr,char var){

        if(arr[0][0]==var && arr[0][1]==var && arr[0][2]==var )return 1;
        else if(arr[1][0]==var && arr[1][1]==var && arr[1][2]==var)return 1;
        else if(arr[2][0]==var && arr[2][1]==var && arr[2][2]==var)return 1;
        else if(arr[0][0]==var && arr[1][0]==var && arr[2][0]==var)return 1;
        else if(arr[0][1]==var && arr[1][1]==var && arr[2][1]==var)return 1;
        else if(arr[0][2]==var && arr[1][2]==var && arr[2][2]==var)return 1;
        else if(arr[0][0]==var && arr[1][1]==var && arr[2][2]==var)return 1;
        else if(arr[2][0]==var && arr[1][1]==var && arr[0][2]==var)return 1;
        else return 0;
    }

    public static void display(char[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
            System.out.println();
        }
        return;
    }

    public static int checkValidity(char [][] arr,int x,int y, char val){
        if(arr[x-1][y-1]=='-')return 1;
        else{
            System.out.println("Already occupied. Reinput");
            return 0;
        }
    }

    public static void putInArray(char[][] arr, int x, int y, char var){
        arr[x-1][y-1]=var;
        display(arr);
        return;
    }

    public static int checkIfSpace(char [][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]=='-')return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char arr[][] = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                arr[i][j]='-';
            }
        }



        char var1, var2;
        for(;;){
            System.out.print("As player1 chose X or O: ");
            var1 = sc.next().charAt(0);
            if(var1=='X' || var1=='O') {
                if (var1 == 'X') var2 = 'O';
                else var2 = 'X';
                break;
            }else{
                System.out.println("Invalid choice.Rechoose");
            }
        }

        int player=1,x1,y1,x2,y2;

        for(;;) {
            if(player==1) {
                System.out.print("Player1 enter your coordinate X: ");
                x1 = sc.nextInt();
                System.out.print("Player1 enter your coordinate Y: ");
                y1 = sc.nextInt();
                if(x1>3 || y1>3){
                    System.out.println("Out of playing area.Please reinput");
                }else {
                    if(checkValidity(arr,x1,y1,var1)==1) {
                        putInArray(arr, x1, y1, var1);
                        player = 2;
                    }
                }
            }else{
                System.out.print("Player2 enter your coordinate X: ");
                x2 = sc.nextInt();
                System.out.print("Player2 enter your coordinate Y: ");
                y2 = sc.nextInt();
                if(x2>3 || y2>3){
                    System.out.println("Out of playing area.Please reinput");
                }else{
                    if(checkValidity(arr,x2,y2,var2)==1) {
                        putInArray(arr, x2, y2, var2);
                        player = 1;
                    }
                }
            }

            if(player==1){
                if(check(arr,var2)==1){
                    System.out.println("Player 2 wins.Hurray");
                    break;
                }

            }else{
                if(check(arr,var1)==1){
                    System.out.println("Player 1 wins.Hurray");
                    break;
                }

            }
            if(checkIfSpace(arr)==0){
                System.out.println("Match Drawn");
                break;
            }

        }



    }
}