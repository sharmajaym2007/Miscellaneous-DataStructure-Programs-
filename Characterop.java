/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Jay Sharma
 */
public class Characterop {
    
    public void maxOccur(String ip)
    {
        
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
        for(int i = 0; i<ip.length();i++)
        {
            char ch = ip.charAt(i);
            if(hash.containsKey(ch))
            {
                hash.put(ch, (hash.get(ch)+1));
                
            }
            else
            {
                hash.put(ch, 1);
            }
        }
        
       //Set set = hash.entrySet();
       Entry<Character, Integer> maxEntry = null;
       for(Entry<Character,Integer> entry : hash.entrySet())
       {
          if(maxEntry == null)
          {
              maxEntry = entry;
          }
         
          else if(maxEntry.getValue() < entry.getValue())
          {
              maxEntry = entry;
          }
       }
        System.out.println(maxEntry.getKey());
       
        
    }
    public static void main(String[] args) {
        Characterop op = new Characterop();
        op.maxOccur("AABBBCCCCDDDDDDDDDD");
    }
    
}
