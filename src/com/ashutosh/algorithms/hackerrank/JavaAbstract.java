package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/4/2015.
 */
import java.util.*;

abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }

}

class MyBook extends Book
{
    String title;
    void setTitle(String s){
        this.title=s;
    }
    String getTitle()
    {
        return title;
    }

}

public class JavaAbstract
{

    public static void main(String []args)
    {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());

    }
}