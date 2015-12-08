package com.ashutosh.algorithms.puzzles;

/**
 * Created by dell on 12/7/2015.
 */
public class RatMaze {
    static boolean solveMaze(int [][]maze,int i,int j,int n){
        if(i==n && j==n){
            maze[i][j]=1;
            return true;
        }
        else if(i>n || j>n)return false;
        else if(maze[i][j]==0){
            return false;
        }else{
            maze[i][j]=1;
            return solveMaze(maze,i+1,j,n)||solveMaze(maze,i,j+1,n);
        }
    }
    static void printMaze(int [][]maze){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args []) {

        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        if(solveMaze(maze,0,0,maze.length-1)==true)printMaze(maze);
    }
}
