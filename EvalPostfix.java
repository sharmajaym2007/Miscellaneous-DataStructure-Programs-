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
class Stacks {
    
    int stack[];
    int top;
    int size;
    
    Stacks(int size){
    stack=new int[size];
    top = -1;
    this.size = size; 
    
    }
    
    
    int push(int data)
    {
       
        stack[++top] = data;  
        size++;
        return top;
    }
    
    int pop()
    {
        size--;
        //stack[top] = 0;
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

}

public class EvalPostfix {

    public void evalPostfix(String input)
    {
        Stacks ss =new Stacks(5);
        int num1, num2,res = 0; 
        char arr[]=input.toCharArray();
        for(int i = 0; i<arr.length;i++)
        {
            
            if(isNumber(String.valueOf(arr[i])) == 1)
            {
                ss.push(Integer.parseInt(String.valueOf(arr[i])));
            }
            else
            {
                switch(arr[i])
                {
                        case '+':
                        num1 = ss.pop();
                        num2 = ss.pop();
                        res = num1 + num2;
                        ss.push(res);
                        break;
                            
                        case '-':
                        num1 = ss.pop();
                        num2 = ss.pop();
                        res = num2 - num1;
                        ss.push(res);
                        break;
                            
                            
                        case '/':
                        num1 = ss.pop();
                        num2 = ss.pop();
                        res = num2 / num1;
                        ss.push(res);
                        break;
                            
                            
                        case '*':
                        num1 = ss.pop();
                        num2 = ss.pop();
                        res = num1 * num2;
                        ss.push(res);
                        break;
                            
                        case '^':
                        num1 = ss.pop();
                        num2 = ss.pop();
                        res = num1 ^ num2;
                        ss.push(res);
                        break;
                            
                            
                            
            
                }
            }
        }
        while(!(ss.top == -1))
        {
            System.out.print(ss.pop());
        }
        
        
    }
    
    public int isNumber(String a)
    {
        int b=0;
        try{
            b = Integer.parseInt(a);
            return 1;
        }
        catch(NumberFormatException n)
        {
            return -1;
        }
        
    }
    
    
    public static void main(String[] argse) {
        EvalPostfix ep = new EvalPostfix();
        ep.evalPostfix("231*+9-");
       
    }
}
