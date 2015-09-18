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
public class AddDigits {
    // 38
    // 3 + 8 = 11...1+1 = 2
    // o/p = 2
    public void addDigits(int number)
    {
        int sum = 0;
        while(number > 0)
        {
            sum+=number % 10;
            number = number / 10;
        }
        System.out.println("Sum is "+sum);
        
    }
  
    
    public static void main(String[] args) {
     
        AddDigits a = new AddDigits();
        a.addDigits(1234);
    }
    
    
    
}
