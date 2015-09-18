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
class StackImpl{
    int top;
    int arr[];
    int size;
    StackImpl(int size)
    {
        this.size = size;
        top = -1;
        arr=new int[size];
    }
    
    public void push(int val)
    {
        arr[++top]=val;
    }
    int pop()
    {
        return arr[top--];
    }
    
    int peek()
    {
        return arr[top];
    }
    boolean isFull()
    {
        return (size-1 == top);
    }
    
    
    
}



public class Stack1 {
    public static void main(String[] args) {
    StackImpl st = new StackImpl(5);
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    int a = st.peek();
    boolean b = st.isFull();
        System.out.println("Element is"+a);
        System.out.println("Is Full: "+b);
    }
   
    
}
