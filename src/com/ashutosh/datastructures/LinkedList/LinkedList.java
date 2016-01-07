package com.ashutosh.datastructures.linkedList;

import java.util.Scanner;


/**
 * Created by dell on 11/9/2015.
 */
public class LinkedList {

    static class Node{
        int data;
        Node next;
    }

    static void printLL(Node head){  //Print elements of the linked list
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        return;
    }

    static Node insertNth(Node head, int data, int position) { //Insert element at a specific position
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) return newNode;
        else if (head.next == null) {
            if (position == 0) {
                newNode.next = head;
                head = newNode;
                return head;
            } else {
                head.next = newNode;
                return head;
            }
        }else {
            if (position == 0) {
                newNode.next = head;
                head = newNode;
                return head;
            } else {
                Node temp = head;
                for (int i = 1; i < position; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
        }
    }

    static Node deleteNth(Node head,int position) { //delete element at a specific position

        if (head == null) {
            System.out.println("Nothing to delete");
            return head;
        }
        else if (head.next == null) {
            if (position == 0) {
                return null;
            } else {
                System.out.println("Nothing there in this position to delete");
                return head;
            }
        }else {
            if (position == 0) {
                return head.next;
            } else {
                Node temp = head;
                for (int i = 1; i < position; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                return head;
            }
        }

    }

    static Node reverseLLRecursive(Node head){  //recursive reversing of linked list
        if(head==null) return null;
        else if(head.next==null)return head;
        else {
            Node nextNode = head.next;
            head.next = null;
            Node revereseNode = reverseLLRecursive(nextNode);
            nextNode.next = head;
            return revereseNode;
        }
    }
    static Node reverseLLIterative(Node head){  //Iterative reversing of linked list
        if(head==null) return null;
        else if(head.next==null)return head;
        else if(head.next.next==null){
            Node temp=head.next;
            temp.next=head;
            head.next=null;
            return temp;
        }else {
            Node first=head;
            Node second=first.next;
            Node third =second.next;
            first.next=null;
            while(third!=null){
                second.next=first;
                first=second;
                second=third;
                third=third.next;
            }
            second.next=first;
            return second;
        }
    }

    static boolean ifCycle(Node head){  // method to find a cycle in the linked list
        if(head==null)return false;
        Node first=head;
        Node second=head.next;
        while(first!=second && second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        if(first==second)return true;
        else return false;
    }
    static int lengthOfCycle(Node head){  // method to find the length of the cycle
        if(head==null)return 0;
        Node first=head;
        Node second=head.next;
        while(first!=second && second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        int count=0;
        while(first!=second){
            first=first.next;
            count++;
        }
        return count;
    }

    static Node cycleStarting(Node head){  //method to find the starting node of the cycle
        if(head==null)return head;
        Node first=head;
        Node second=head.next;
        while(first!=second && second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        first=head;
        second=second.next;
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return first;
    }
    static int CompareLists(Node headA, Node headB) {  //compare two linked lists

        Node temp1=headA,temp2=headB;
        if(temp1==null && temp2==null){
            return 1;
        }else{

            while(temp1.next!=null && temp2.next!=null){
                if(temp1.data!=temp2.data){
                    return 0;
                }else{
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }
            if(temp1.next==null && temp2.next==null){
                if(temp1.data==temp2.data)return 1;
                else return 0;
            }
            else return 0;
        }
    }

    static Node MergeLists(Node headA, Node headB) { //merge two sorted linked lists

        Node current=new Node();
        Node headC=current;
        Node tempA=headA,tempB=headB;
        if(headA==null)return headB;
        if(headB==null)return headA;
        while(tempA!=null && tempB!=null){
            if(tempA.data<tempB.data){
                current.next=tempA;
                current=current.next;
                tempA=tempA.next;
            }
            else{
                current.next=tempB;
                current=current.next;
                tempB=tempB.next;
            }
        }
        while(tempA!=null){
            current.next=tempA;
        }
        while(tempB!=null){
            current.next=tempB;
        }
        headC=headC.next;
        return headC;
    }

    static Node intersectionPoint(Node headA,Node headB){

        int count1=0;
        int count2=0;
        Node temp1=headA,temp2=headB;
        while(temp1.next!=null){
            count1++;
            temp1=temp1.next;
        }
        while(temp2.next!=null){
            count2++;
            temp2=temp2.next;
        }
        int diff=Math.abs(count1-count2);
        temp1=headA;
        temp2=headB;
        if(count1==Math.max(count1,count2)) {
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        }else{
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        Node head=new Node();
        head.data=0;
        System.out.print("Enter the number of nodes you want: ");
        int n=sc.nextInt();

        for(int i=1;i<n;i++){
            System.out.print("Enter the value of the " + (i + 1) + " data: ");
            int val=sc.nextInt();
            head=insertNth(head,val,i);
        }

        System.out.print("Your current linked list is: ");
        //head=deleteNth(head, 0);         //to delete node in the given position
        //head=reverseLLRecursive(head);   //to print the recursive reverse of linked list
        //head=reverseLLIterative(head);

        //boolean flag=ifCycle(head);      //To see if cycle exists in the linked list
        //if(flag==true)System.out.print("Cycle");
        //else System.out.print(" No Cycle");

        printLL(head);

    }


}

