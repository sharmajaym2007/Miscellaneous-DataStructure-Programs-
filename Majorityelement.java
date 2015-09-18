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
public class Majorityelement {
    
    
    public int majElement(int a[])
    {
        int i = 0;
        int j = 1;
        Arrays.sort(a);
        int hlf = (a.length)/2;
        int count = 0;
        while(j<a.length)
        {
            if(a[i]==a[j])
            {
                count++;
                if(count+1>=hlf)
                {
                    return a[i];
                }
                i++;
                j++;
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
        Majorityelement me = new Majorityelement();
        int a[]={2,2,2,2,2,2,2,3,4,2,4,4,2,4,4};
        System.out.println(me.majElement(a));
    }
    
}
