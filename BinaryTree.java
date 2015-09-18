/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Jay Sharma
 */
class Node1
{
    int data;
    Node1 left;
    Node1 right;
    
}

public class BinaryTree {
  public static Node1 setNode(int data)
    {
    
        Node1 n = new Node1();
        n.data = data;
        n.left = null;
        n.right = null;
        return n;
        
    }
    
  
    public boolean checkIdentical(Node1 r1, Node1 r2)
    {
      
      if(r1==null && r2==null)
      {
        return true;
      }
      
      if(r1!=null && r2!=null)
      {
        return
        (
           r1.data == r2.data && checkIdentical(r1.left,r2.left) && 
           checkIdentical(r1.right,r2.right)
        
        
        );
      }
      
      return false;
      
    }
    
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
               
        Node1 root1 = setNode(1);
        root1.left = setNode(2);
        root1.right = setNode(1);
        
      
        Node1 root2 = setNode(1);
        root2.left = setNode(2);
        root2.right = setNode(3);
      
        boolean a = bt.checkIdentical(root1,root2);
       System.out.println(a);
      
        
    } 
}
