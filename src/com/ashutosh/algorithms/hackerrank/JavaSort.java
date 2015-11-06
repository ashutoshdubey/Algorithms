package com.ashutosh.algorithms.hackerrank;

/**
 * Created by dell on 11/6/2015.
 */
/*
Sample input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
*/

import java.util.*;

class ClassStudent{
    private int id;
    private String fname;
    private double cgpa;
    public ClassStudent(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class ListChecker{                                  /*My part of Solution*/

    public Comparator<ClassStudent> desc =
            new Comparator<ClassStudent>() {
                @Override
                public int compare(ClassStudent o1, ClassStudent o2) {
                    if(o1.getCgpa() == o2.getCgpa()){
                        if(o1.getFname()==o2.getFname()){
                            return o2.getId()-o1.getId();
                        }else return o1.getFname().compareTo(o2.getFname());
                    }
                    return Double.compare(o2.getCgpa(),o1.getCgpa());
                }
            };
}


//Complete the code
public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<ClassStudent> studentList = new ArrayList<ClassStudent>();
        ListChecker check=new ListChecker();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            ClassStudent st = new ClassStudent(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,check.desc);

        for(ClassStudent st: studentList){
            System.out.println(st.getFname());
        }
    }
}
