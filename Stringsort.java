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
public class Stringsort {
    
    
    public void sort(String str)
    {
        int a=0, b=0, c=0;
        char[] strarr = str.toCharArray();
        Arrays.sort(strarr);
        String op = "";
        for (char ch : strarr) {
            if(ch == 'A')
            {
                a++;
            }
            else if(ch == 'B')
            {
                b++;
            }
            else if(ch == 'C')
            {
                c++;
            }
            op+=ch;
                     
        }
        System.out.println(op);
        System.out.println(a+"A"+b+"B"+c+"C");
    }
    
    public void count(char[] ch)
    {
        
    }
    
    
    
    public static void main(String[] args) {
        Stringsort ss = new Stringsort();
        ss.sort("BABCBAAC");
    }
}
