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
public class Stackdemo {
    
    char stack[];
    int top;
    int size;
    
    Stackdemo(int size){
    stack=new char[size];
    top = -1;
    this.size = size; 
    
    }
    
    
    int push(char data)
    {
        stack[++top] = data;  
        size++;
        return top;
    }
    
    char pop()
    {
        size--;
        stack[top] = 0;
        return stack[top--];
        
        
    }
    
    void display()
    {
        for(int i = 0;i<stack.length;i++)
        {
            System.out.print(stack[i]+" ");
            
        }
        System.out.println("");
    }
    
    
    int peek()
    {
        return stack[top];
    }
    boolean isFull()
    {
        return (size-1 == top);
    }
    
    
    
    public int infixtoPostfix(String input)
    {
        char ch[] = input.toCharArray();
        
        for(int i = 0;i<ch.length;i++)
        {
            if(ch[i]=='*' || ch[i]=='/')
            {
                while(stack[top]=='^')
                {
                    System.out.print(stack[top--]);
                    
                }
                push(ch[i]);
            }
            else if(ch[i]=='+')
            {
               
                while(top!=-1 && (stack[top]=='^' || stack[top]=='*' || stack[top]=='/' || stack[top]=='-'))
                {
                    System.out.print(stack[top--]);
                }
              
                
                push(ch[i]);
                
                
            }
            
            else if(ch[i]=='-')
            {
                
                
                while(top!=-1 && (stack[top]=='^' || stack[top]=='*' || stack[top]=='/' || stack[top]=='+') )
                {
                    System.out.print(stack[top--]);
                }
              
                
                push(ch[i]);
                
                
            }
            
            else if(ch[i]=='^')
            {
                push(ch[i]);
            }
            
            else if(ch[i]=='(')
            {
                push(ch[i]);
            }
            else if(ch[i]==')')
            {
                while(stack[top]!='(')
                {
                    System.out.print(stack[top--]);
                    
                }
                stack[top]=stack[top--];
            }
            else
            {
                System.out.print(ch[i]);
            }
            
        }
     while(top!=-1)
     {
         System.out.print(stack[top--]);
     }
        return -1;  
    }
    
    
    public static void main(String args[])

    {
        Stackdemo sd = new Stackdemo(8);
        sd.infixtoPostfix("a+b*(c^d-e)^(f+g*h)-i");
        //sd.display();
       
    }
}
