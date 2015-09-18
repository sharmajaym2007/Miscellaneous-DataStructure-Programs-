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
public class NoRepeat {

    

   
    //[1,2,2,1,3,5]
    // o/p: [3,5]
    
     
    
    void storevalue() {
        
    
    
     HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
        
        int a[]={1,2,2,1,3,5};
        
        
        for(int i = 0; i < a.length; i++)
        {
            if(hmap.containsKey(a[i]))
            {
             int value = hmap.get(a[i]);
             hmap.put(a[i],++value);   
            }
            else
            {    
            hmap.put(a[i], 1);
            }
        }
        
        Set set = hmap.entrySet();
        
        Iterator itr = set.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        
       getKeyFromValue(hmap, 1);
    }
    
    
    
    
    
    
    public static void getKeyFromValue(Map hm, Object value) {
    
        for(Object o: hm.keySet())
        {
            if(hm.get(o).equals(value))
            {
                System.out.println(o);
          
            }
    }
    
  }
    
    
    public static void main(String[] args) {
        NoRepeat n =new NoRepeat();
        n.storevalue();
        
        
    }

    
        
            
    
}
