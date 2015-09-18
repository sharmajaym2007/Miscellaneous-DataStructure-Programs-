/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Arrays;

/**
 *
 * @author Jay Sharma
 */
public class Oddoccur {
    
    
    
     public int oddOccur(int a[])
    {
        int i = 0;
        int j = 1;
        Arrays.sort(a);
    
        int count = 0;
        while(j<a.length)
        {
            while(j<a.length && a[i]==a[j])
            {
                count++;
                i++;
                j++;
            }
            if((count+1)%2!=0)
                {
                    return a[i];
                }

            else
            {
                count = 0;
                i++;
                j++;
            }
            
            
            
           
        }
        
        
        
        return 0;
    }
     
     
     public static void main(String[] args) {
        Oddoccur oo = new Oddoccur();
        int a[]={1,2,2,3,2,3,1,3,3};
         System.out.println(oo.oddOccur(a));
    }
   
    
    
}
