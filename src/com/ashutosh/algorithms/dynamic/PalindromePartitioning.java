package com.ashutosh.algorithms.dynamic;

/**
 * Created by dell on 11/30/2015.
 */
public class PalindromePartitioning {

    static int usingDynamic(char []p,int size){
        int length[][]=new int[size][size];
        boolean palin[][]=new boolean[size][size];
           /* For simplicity of the program, one extra row and one extra column are
       allocated in m[][].  0th row and 0th column of m[][] are not used */
        for(int i=0;i<size;i++){
            length[i][i]=0;
            palin[i][i]=true;
        }
        int j=0,q=0;
        for(int l=2;l<=size;l++){                         //l is the chain length
            for(int i=0;i<size-l+1;i++){                 //i marks the starting index of the chain
                j=i+l-1;                                 //j marks the ending index of chain
                length[i][j]=Integer.MAX_VALUE;

                if (l == 2)
                    palin[i][j] = (p[i] == p[j]);
                else
                palin[i][j] = (p[i] == p[j]) && palin[i+1][j-1];

                if (palin[i][j] == true)
                    length[i][j] = 0;
                else
                {
                    // Make a cut at every possible localtion starting from i to j,
                    // and get the minimum cost cut.
                    length[i][j] = Integer.MAX_VALUE;
                    for (int k=i; k<j; k++)
                        length[i][j] = Math.min(length[i][j], length[i][k] + length[k + 1][j] + 1);
                }

            }
        }
        return length[0][size-1];                           //similar to the return of recursive statement where start=1 and end=size-1
    }

    public static void main(String args[]){
        String str="ababbbabbababa";
        char arr[]=str.toCharArray();
        int ans=usingDynamic(arr,arr.length);
        System.out.print("Minimum partitions to convert it to string: " + ans);
    }
}


