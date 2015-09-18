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
public class reverse {
    
    public static void main(String[] args) {
        // input = 65
        // output = 56
        int rev = 0;
        int a = 00000110;
        while(a!=0)
        {
        
        rev = rev*10 + a%10;
        a = a/10;
        }
        
        System.out.println("fd"+rev);
        
    }
    
}
