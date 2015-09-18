/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;
import java.util.*;
/**
 *
 * @author Jay Sharma
 */
public class infixtopostfix {
    
    public static void main(String[] args) {
        
        String expr = "A * (B + C)";
        Stack s = new Stack();
        char[] ch= expr.toCharArray();
        for(int i = 0;i<ch.length;i++)
        {
            if(ch[i]=='(')
            {
                s.push(ch[i]);
            }
            
            else if(ch[i]=='/' || ch[i]=='*')
            {
                s.push(ch[i]);
            }
            
            else if(ch[i]=='+' || ch[i]=='-')
            {
                String a1 = s.peek().toString();
                char a = a1.charAt(0);
                while(a=='*'||a=='/')
                {
                    System.out.print(s.pop());
                    a1 = s.peek().toString();
                    a = a1.charAt(0);
                }
                
                
                    s.push(ch[i]);
                
            }
            else if(ch[i]==')')
            {
                while((s.peek().toString().charAt(0))!='(')
                {
                    
                  System.out.print(s.pop());
                }
                
                
            }
            
            else
            {
                System.out.print(ch[i]);
            }
                
        }
        
        
    }
    
}
