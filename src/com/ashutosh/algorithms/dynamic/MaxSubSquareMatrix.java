package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/30/2015.
 */
public class MaxSubSquareMatrix {
    static void printMaxSubSquare(int M[][],int R, int C)
    {
        int S[][]=new int[R][C];

  /* Set first column of S[][]*/
        for(int i = 0; i < R; i++)
            S[i][0] = M[i][0];

  /* Set first row of S[][]*/
        for(int j = 0; j < C; j++)
            S[0][j] = M[0][j];

  /* Construct other entries of S[][]*/
        for(int i = 1; i < R; i++)
        {
            for(int j = 1; j < C; j++)
            {
                if(M[i][j] == 1) {
                    int temp = Math.min(S[i][j - 1], S[i - 1][j]);
                    S[i][j] = Math.min(temp, S[i - 1][j - 1]) + 1;
                }else {
                    S[i][j] = 0;
                }
            }
        }

  /* Find the maximum entry, and indexes of maximum entry
     in S[][] */
        int max_of_s = S[0][0], max_i = 0, max_j = 0;
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(max_of_s < S[i][j])
                {
                    max_of_s = S[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(" Maximum size sub-matrix is:");
        for(int i = max_i; i > max_i - max_of_s; i--)
        {
            for(int j = max_j; j > max_j - max_of_s; j--)
            {
                System.out.print( M[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int  M[][] =  {{0, 1, 1, 0, 1},
            {1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0}};
        printMaxSubSquare(M,M.length,M[0].length);
    }
}
