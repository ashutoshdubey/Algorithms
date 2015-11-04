package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
*/

import java.util.*;
import java.io.*;


class BiCycle
{
    String define_me()
    {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle
{
    String define_me()
    {
        return "a cycle with an engine.";
    }

    MotorCycle()
    {


        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        String temp=super.define_me();
        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class JavaMethodOverride2{
    public static void main(String []argh)
    {
        MotorCycle M=new MotorCycle();
    }
}
