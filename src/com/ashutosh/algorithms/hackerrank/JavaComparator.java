package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
import java.io.*;
import java.util.*;

class Checker{                                  /*My part of Solution*/

    public Comparator<Player> desc =
        new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.score == o2.score){
                    return o2.name.compareTo(o1.name);
                }
                return o2.score - o1.score;
            }
        };
}

class Player
{
    String name;
    int score;
}

public class JavaComparator {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player Player[]=new Player[N];
        Checker check=new Checker();
        for(int i=0;i<N;i++)
        {
            s=br.readLine().trim();
            st=new StringTokenizer(s);
            Player[i]=new Player();
            Player[i].name=st.nextToken();
            Player[i].score=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player, check.desc);
        for(int i=0;i<Player.length;i++)
        {
            System.out.printf("%s %s\n",Player[i].name,Player[i].score);
        }


    }
}