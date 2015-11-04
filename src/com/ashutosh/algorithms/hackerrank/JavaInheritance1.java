package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
class Animal{
    void walk()
    {
        System.out.println("I am walking");
    }
}

class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }
}
public class JavaInheritance1
{

    public static void main(String args[])
    {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();

    }
}
