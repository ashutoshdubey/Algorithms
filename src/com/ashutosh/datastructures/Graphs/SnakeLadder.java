package com.ashutosh.datastructures.graphs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dell on 12/23/2015.
 */
public class SnakeLadder {
    static class QueueEntry {
        int v;     // Vertex number
        int dist;  // Distance of this vertex from source
        QueueEntry(int v,int dist){
            this.v=v;
            this.dist=dist;

        }
    }

    static int getMinDiceThrows(int move[],int N){
        boolean visited[]=new boolean[N];
        for(int i=0;i<N;i++){
            visited[i]=false;
        }
        Queue<QueueEntry> myqueue= new ArrayDeque();
        QueueEntry start=new QueueEntry(0,0);
        visited[0]=true;
        myqueue.add(start);
        QueueEntry curr=new QueueEntry(0,0);
        while (!myqueue.isEmpty()){
             curr=myqueue.peek();
            int v=curr.v;
            if(v==N-1)break;
            myqueue.remove();
            for(int j=v+1;j<=(v+6)&&j<N;j++){
                if(!visited[j]){
                    // Otherwise calculate its distance and mark it
                    // as visited
                    QueueEntry a=new QueueEntry(0,0);
                    a.dist = (curr.dist + 1);
                    visited[j] = true;

                    // Check if there a snake or ladder at 'j'
                    // then tail of snake or top of ladder
                    // become the adjacent of 'i'
                    if (move[j] != -1)
                        a.v = move[j];
                    else
                        a.v = j;
                    myqueue.add(a);
                }

            }


        }

        return curr.dist;
    }
    public static void main(String args[]){
        int N = 30;
        int moves[]=new int[N];
        for (int i = 0; i<N; i++)
            moves[i] = -1;

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        System.out.print("Min Dice throws required is " +getMinDiceThrows(moves, N));
    }

}
