/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;


/**
 *
 * @author Jay Sharma
 **/

public class Main {
    //{2,3,-4,6}
    // Maximum product = 3 *6 = 18 
    int cases=1;
    public void maxProduct(ArrayList<Integer> ip) // Finds Maximum Product by storing ArrayList in TreeSet and multiplying last two elements
    {
        int num = 1;
        int n1 = 0;
        TreeSet<Integer> ts = new TreeSet<>();
        int num1 = 0;
        // 2 3 -2 3 4
        Iterator itr = ip.iterator();
        while(itr.hasNext())
            
        {       
                num = 1;
                int n = (int)itr.next();
                while(n > 0)
                {
                num = num * n;
                num1 = 1; 
                if(itr.hasNext())
                {
                 n =(int)itr.next();
                }
                else
                {
                    break;
                }
                        
                }
                ts.add(num);
                if(n<0)
                {
               // ts.add(num);
                num1 = -1;
                n1++;
                }
                                    
                
                 
                
	}
            
            
                
            
           
            
        
        if(num1 == -1 && n1 ==  ip.size())
        {
            System.out.println("Case #"+cases+": The Maximum Product is 0"+".");
            System.out.println(" ");
            cases++;
           // read();
        }
        else
        {
            System.out.println("Case #"+cases+": The Maximum Product is "+ts.last()+".");
            System.out.println(" ");
            cases++;
           // read();
            
        }
    }
    
    public void read() // Takes Input from user
    {
      Scanner sc = new Scanner(System.in);
       while(sc.hasNext())
       {
    int num = 0;
       
       ArrayList<Integer> input = new ArrayList<>();
       //System.out.println("Enter total elements to be entered: ");
       num = sc.nextInt();
       
       for(int i = 0; i< num; i++)
       {
       input.add(sc.nextInt());
       }
        maxProduct(input);
        
        
       }
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
    }

    
    
    
}
