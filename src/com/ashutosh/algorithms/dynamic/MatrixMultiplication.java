package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/27/2015.
 */

//Given an array p[] which represents the chain of matrices such that the ith matrix Ai is of dimension p[i-1] x p[i].
// We need to write a function MatrixChainOrder() that should return the minimum number of multiplications needed to multiply the chain

public class MatrixMultiplication {
    static int usingRecursion(int []p,int i,int j){
        if(i==j)return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int count=usingRecursion(p,i,k)+usingRecursion(p,k+1,j)+p[i-1]*p[k]*p[j];
            if(count<min)min=count;
        }
        return min;
    }
    static int usingDynamic(int []p,int size){
        int length[][]=new int[size][size];
           /* For simplicity of the program, one extra row and one extra column are
       allocated in m[][].  0th row and 0th column of m[][] are not used */
        for(int i=1;i<size;i++){
            length[i][i]=0;
        }
        int j=0,q=0;
        for(int l=2;l<size;l++){                         //l is the chain length
            for(int i=1;i<size-l+1;i++){                 //i marks the starting index of the chain
                j=i+l-1;                                 //j marks the ending index of chain
                length[i][j]=Integer.MAX_VALUE;
                for (int k=i; k<j; k++)                  //k puts bracket between i and j
                {
                    q = length[i][k] + length[k+1][j] + p[i-1]*p[k]*p[j];   // q = cost/scalar multiplications
                    if (q < length[i][j])length[i][j] = q;
                }
            }
        }
        return length[1][size-1];                           //similar to the return of recursive statement where start=1 and end=size-1
    }

    public static void main(String args[]){
        int p[] = {10, 20, 30, 40, 30}; //p array where p[i-1]x p[i] is size of matrix i
        //int ans=usingRecursion(p,1,p.length-1);
        int ans=usingDynamic(p,p.length);
        System.out.print("Minimum steps required to multiply matrix is: " + ans);
    }
}

