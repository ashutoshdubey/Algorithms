package com.ashutosh.datastructures.stacks;

import java.util.Stack;

/**
 * Created by dell on 12/7/2015.
 */
public class NexTGreaterElement {
    static void printNextGreater(int arr[]){
        Stack<Integer> mystack=new Stack<>();
        mystack.push(arr[0]);

        // iterate for rest of the elements
        for (int i=1; i<arr.length; i++)
        {
            int next = arr[i];

            if (mystack.isEmpty() == false)
            {
                // if stack is not empty, then pop an element from stack
                int element = mystack.pop();

            /* If the popped element is smaller than next, then
                a) print the pair
                b) keep popping while elements are smaller and
                stack is not empty */
                while (element < next)
                {
                    System.out.println(element + " " + next);
                    if(mystack.isEmpty() == true) break;
                    element = mystack.pop();
                }

            /* If element is greater than next, then push
               the element back */
                if (element > next)
                    mystack.push(element);
            }

        /* push next to stack so that we can find
           next greater for it */
            mystack.push(next);
        }

    /* After iterating over the loop, the remaining
       elements in stack do not have the next greater
       element, so print -1 for them */
        while (mystack.isEmpty() == false)
        {
            int element = mystack.pop();
            int next = -1;
            System.out.println(element +" "+ next);
        }
    }
    public static void main(String args[]){
        int arr[]= {11, 13, 21, 3};
        printNextGreater(arr);
    }
}
