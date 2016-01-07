package com.ashutosh.datastructures.trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by dell on 12/2/2015.
 */
public class Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left,Node right){          //constructor
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    static Node createTree(int arr[],int first,int last){  //method to create a sample tree
        if(last<first)return null;
        int mid=(first+last)/2;
        Node newnode=new Node(arr[mid],null,null);
        newnode.left=createTree(arr,first,mid-1);
        newnode.right=createTree(arr,mid+1,last);
        return newnode;
    }
    static void preOrderRec(Node root){         //recursive version of preorder
        if(root!=null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    static void preOrderIter(Node root){        //iterative version of preorder
        Stack<Node> mystack=new Stack<Node>();
        mystack.push(root);
        while(!mystack.empty()){
            Node temp=mystack.pop();
            if(temp!=null) {
                System.out.print(temp.data + " ");
                mystack.push(temp.right);
                mystack.push(temp.left);
            }
        }
    }
    static void inOrderRec(Node root){          //recursive version of inorder
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }
    static void inOrderIter(Node root) {         //iterative version of inorder
        Stack<Node> mystack = new Stack<Node>();
        Node curr = root;
        while(true){
            while (curr!= null) {
                mystack.push(curr);
                curr = curr.left;
            }
            if(curr==null && !mystack.empty()){
                Node temp = mystack.pop();
                System.out.print(temp.data + " ");
                curr=temp.right;
            }else {
                break;
            }
        }
    }
    static void postOrderRec(Node root){        //recursive version of postorder
        if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
    static void postOrderIter(Node root){       //iterative version of postorder
        Stack<Node> mystack1=new Stack<Node>();
        Stack<Node> mystack2=new Stack<Node>();
        mystack1.push(root);
        while(!mystack1.empty()){
            Node temp=mystack1.pop();
            if(temp!=null) {
                mystack1.push(temp.left);
                mystack1.push(temp.right);
                mystack2.push(temp);
            }
        }
        while(!mystack2.empty()){
            System.out.print(mystack2.pop().data+" ");
        }
    }
    static void levelOrder(Node root){                  //level order traversal
        Queue<Node> myqueue=new LinkedList<Node>();
        myqueue.add(root);
        myqueue.add(null);
        while(!myqueue.isEmpty()){
            if(myqueue.element()!=null) {
                Node temp = myqueue.remove();
                System.out.print(temp.data + " ");
                if (temp.left != null) myqueue.add(temp.left);
                if (temp.right != null) myqueue.add(temp.right);
            }else{
                System.out.println();
                myqueue.remove();
                if(!myqueue.isEmpty()){
                    myqueue.add(null);
                }
            }
        }
    }
    static boolean searchElement(Node root,int val){            //searches if an element is present in a tree
        if (root==null)return false;
        if(root.data==val)return true;
        else {
            return searchElement(root.left,val)||searchElement(root.right,val);
        }
    }
    static int sumOfElements(Node root){                //returns the sum of elements of th tree
        if(root==null)return 0;
        else return root.data +sumOfElements(root.left)+sumOfElements(root.right);

    }
    static int height(Node root){                   //returns the height of  the tree
        if (root==null)return 0;
        else return 1+Math.max(height(root.left), height(root.right));
    }
    static int maximumElement(Node root){           //returns the maximum element of the tree
        if(root==null)return Integer.MIN_VALUE;
        int temp=root.data;
        int childmax=Math.max(maximumElement(root.left),maximumElement(root.right));
        return Math.max(temp,childmax);
    }
    static int lengthOfLongestChain(Node root){ //length of the longest chain in the tree
        //also called diameter of the tree
        int maxi;
        if (root==null)return 0;
        else {
            maxi=Math.max(lengthOfLongestChain(root.left), lengthOfLongestChain(root.right));
            return Math.max(maxi,1+height(root.left)+ height(root.right));
        }
    }
    static Node createMirror(Node root){
        if(root==null)return null;
        Node temp=root;
        Node rightnode=createMirror(temp.right);
        Node leftnode=createMirror(temp.left);
        temp.left=rightnode;
        temp.right=leftnode;
        return temp;
    }
    static boolean checkIfMirror(Node root,Node root2){
        if(root==null || root2==null){
            if(root==null && root2==null)return true;
            else return false;
        }else {
            if (root.data == root2.data) {
                return checkIfMirror(root.right, root2.right) && checkIfMirror(root.left, root2.left);
            }else return false;
        }
    }
    static void printTopView(Node root){        //prints top view of the tree
        leftTop(root.left);
        System.out.print(root.data+" ");
        rightTop(root.right);
    }
    static void leftTop(Node root){
        if(root!=null) {
            leftTop(root.left);
            System.out.print(root.data + " ");
        }
    }
    static void rightTop(Node root){
        if(root!=null) {
            System.out.print(root.data + " ");
            rightTop(root.right);
        }
    }
    static int leafNodes(Node root){                //returns the number of leaf nodes
        if(root==null) return 0;
        else if (root.left==null&& root.right==null)return 1;
        else return leafNodes(root.left)+leafNodes(root.right);
    }
    static int halfNodes(Node root){              //calculates the number of half leaf nodes
        if(root==null) return 0;
        if(root.right!=null || root.left!=null){
            if(root.left==null && root.right!=null)return 1;
            else if(root.right==null && root.left!=null)return 1;
            else return halfNodes(root.left)+halfNodes(root.right);
        }else return 0;

    }
    static int fullNodes(Node root){            //returns number of full nodes
        if(root==null) return 0;
        if(root.right!=null && root.left!=null)return 1+fullNodes(root.left)+fullNodes(root.right);
        else return 0;
    }
    static int deepestNode(Node root){          //returns deepest node, can also be solved by levelorder
        int r=height(root.right);
        int l=height(root.left);
        if(r>=l){                               //if both sides give equal height we prefer right side
            if(r==1)return root.right.data;
            return deepestNode(root.right);
        }else{
            if(l==1)return root.left.data;
            return deepestNode(root.left);
        }
    }
    static void leftSideView(Node root,int level){      //print the left side view
        if(root==null)return;
        if(maxlevel<level){
            System.out.print(root.data +" ");
            maxlevel=level;
        }
        leftSideView(root.left,level+1);
        leftSideView(root.right,level+1);
    }
    static int maxlevel=0;                                  //static maxlevel for leftside view

    static int  maxLeafToRoot(Node root){   //maximum sum of root to elaf paths
        if (root==null)return 0;
        return root.data+ Math.max(maxLeafToRoot(root.left),maxLeafToRoot(root.right));
    }

    static int maxPathSum(Node root){  //similar to longest chain.
        // In this instead of making use of height make use of maximum root to leaf sum
        int maxi;
        if (root==null)return 0;
        else {
            maxi=Math.max(maxPathSum(root.left), maxPathSum(root.right));
            return Math.max(maxi,root.data+maxLeafToRoot(root.left)+ maxLeafToRoot(root.right));
        }
    }
    static void verticalSum(Node root){             //prints vertical sum
        if (root == null) { return; }

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        verticalSumUtil(root, 0, hM);
        if (hM != null) {
            System.out.println(hM.entrySet());
        }
    }
    static void verticalSumUtil(Node root,int hD,HashMap<Integer, Integer> hM ){ //part of verticaSum
        if (root == null) {  return; }
        verticalSumUtil(root.left, hD - 1, hM);
        int prevSum = (hM.get(hD) == null) ? 0 : hM.get(hD);
        hM.put(hD, prevSum + root.data);
        verticalSumUtil(root.right, hD + 1, hM);
    }
    static int sumTree(Node root){      //converts a tree into equivalent sumtree
        if(root==null)return 0;
        int curdata=root.data;
        int leftsum=sumTree(root.left);
        int rightsum=sumTree(root.right);
        root.data=rightsum+leftsum;
        return curdata+root.data;
    }

    //also practice the code dor making Node called right hand connecting neighbours

    static int sizeOftree(Node root){           // prints the number of nodes
        if (root==null)return 0;
        return 1+sizeOftree(root.left)+sizeOftree(root.right);
    }
    static void printleafNodes(Node root){      //print  all the leaf nodes
        //this code can be used to print the boundary of the tree combined with right side and left side
        if(root!=null){
            printleafNodes(root.left);
            if(root.left==null && root.right==null)System.out.print(root.data+" ");
            printleafNodes(root.right);
        }
    }

    // *see the problem of making tree using linked list =makes use of queue

    static int leaflevel=0;
    static boolean ifleafLevel(Node root,int level){         // to check if all the leaves are at the same level
        if(root==null) return true;
        if(root.left==null && root.right==null){
            if(leaflevel==0){
                leaflevel=level;
            }
            return(leaflevel==level);
        }
        return ifleafLevel(root.left,level+1)&&ifleafLevel(root.right,level+1);
    }
    static int getMaxWidth(Node root){
        int maxwidth=0;
        for(int i=0;i<heigh(root);i++){
            int width=getWidth(root,i);
            if(width>maxwidth){
                maxwidth=width;
            }
            return maxwidth;
        }
    }
    
    static int getWidth(Node root,int level){
        if (root== NULL)return 0;
        if (level== 1)return 1;  
        else if (level > 1){
            return getWidth(root->left, level-1) + 
            getWidth(root->right, level-1);
        }
    }
    //see the question of printing the bottom view. It makes use of queue and treemap
    // with root having additional parameter called horizontal distance

    public static void main(String args[]){
        int arr[]={3,7,5,9,1,13,17,11,21,8};              //for imitating the tree

        Node root=createTree(arr,0,arr.length-1);
        //preOrderRec(root);
        //inOrderRec(root);
        //postOrderRec(root);
        //preOrderIter(root);
        //inOrderIter(root);
        //postOrderIter(root);
        //levelOrder(root);
        //if(searchElement(root,7)==true)System.out.print("The val is there");
        //else System.out.print("the val is not there");
        //System.out.print("The sum of the elements of the tree is: "+sumOfElements(root));
        //System.out.print("The height of th tree is: "+height(root));
        //System.out.print("The maximum element of the tree is: "+maximumElement(root));
        //System.out.print("The length of the longest chain is: "+lengthOfLongestChain(root));
        //Node root2=createMirror(root);
        //if(checkIfMirror(root,root2))System.out.print("Both are mirror images");
        //else System.out.print("They are not mirror images");
        //printTopView(root);
        //System.out.print("Number of leaf nodes is: "+leafNodes(root));
        //System.out.print("Number of half nodes is: "+halfNodes(root));
        //System.out.print("Number of full leaf nodes is: "+fullNodes(root));
        //System.out.print("The deepest node of the tree is: "+deepestNode(root));
        //leftSideView(root,1);
        //System.out.print("The maximum sum of root to leaf path is: "+maxLeafToRoot(root));
        //System.out.print("The maximum path sum is: "+maxPathSum(root));
        //verticalSum(root);
        //root.data=sumTree(root);
        //System.out.print("The size of the tree is: "+sizeOftree(root));
        //printleafNodes(root);
        //if(ifleafLevel(root,0)==true)System.out.print("The leaves are at the same level");
        //else System.out.print("The leaves are not at the same level");
    }
}
