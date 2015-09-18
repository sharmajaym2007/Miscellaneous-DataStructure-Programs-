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
public class Anagram {

    // I/P: JAY Check YAJ then// 
    //True else //False
    
    public void checkAnagram(String name1, String name2)
    {
        char ch1[]=name1.toCharArray();
        char ch2[]=name2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       
        if(Arrays.equals(ch1, ch2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }
        
    }
    
    
    public static void main(String[] args) {
        Anagram ag=new Anagram();
        ag.checkAnagram("abc", "bac");
    }
    
}
