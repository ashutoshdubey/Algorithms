package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
class Arithmetic{

    static int add(int x,int y){
        return x+y;
    }

}

class Adder extends Arithmetic{

}

class JavaInheritance2{

    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
}