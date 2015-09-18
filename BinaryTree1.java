/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

/**
 *
 * @author Jay Sharma
 */
class Node12{
    int data;
    Node12 right, left;
}



public class BinaryTree1 {
    Node12 temp;
    public Node12 newNode(int data)
    {
        Node12 n = new Node12();
        n.data = data;
        n.left = null;
        n.right = null;
        return n;
    }
    public void postOrder(Node12 n)
    {
        if(n == null)
        {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        
        System.out.print(n.data+" ");
        
    }
    
    public void inOrder(Node12 n)
    {
        if(n == null)
        {
            return;
        }
        inOrder(n.left);
        System.out.println(n.data+" ");
        inOrder(n.right);
    }
    
    public int treeSize(Node12 n)
    {
        if(n == null)
        {
            return 0;
        }
       
        return(treeSize(n.left) +1 + treeSize(n.right));
    }
    
    public boolean isIdentical(Node12 n, Node12 n1)
    {
        if(n == null & n1 == null)
        {
            return true;
        }
        return(isIdentical(n.left, n1.left) && isIdentical(n.right, n1.right) && n.data == n1.data);
    }
    
    public int maxHeight(Node12 n)
    {
        if(n == null)
        {
            return 0;
        }
        int a = maxHeight(n.left);
        int b = maxHeight(n.right);
        
        if(a>b)
            return (a+1);
        else
            return (b+1);
        
    }
    
    public void mirrorTree(Node12 n)
    {
        
        if(n == null)
        {
            return;
        }
        mirrorTree(n.left);
        mirrorTree(n.right);
        
        temp = n.left;
        n.left = n.right;
        n.right = temp;
        
        
    }
    public static void main(String[] args) {
        BinaryTree1 bt1 = new BinaryTree1();
        Node12 n = bt1.newNode(1);
        n.left = bt1.newNode(2);
        n.right = bt1.newNode(3);
        n.left.left = bt1.newNode(4);
        n.left.right = bt1.newNode(5);
        
        Node12 n1 = bt1.newNode(1);
        n1.left = bt1.newNode(2);
        n1.right = bt1.newNode(3);
        n1.left.left = bt1.newNode(4);
        n1.left.right = bt1.newNode(5);
        
        
        //bt1.postOrder(n);
        bt1.mirrorTree(n);
        bt1.inOrder(n);
       //System.out.println("\n"+bt1.treeSize(n));
        //System.out.println("Is Identical "+bt1.isIdentical(n, n1));   
        //System.out.println("Maximum Height "+bt1.maxHeight(n));
        }
}
