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
public class removedup {
    
    public void reDup(int a[])
    {
        
        int j =0;
        int i =1;
        while(i<a.length)
        {
        if(a[j]==a[i])
        {
            i++;
        }
        else
        {
            j++;
            a[j] = a[i];
            i++;
        }
        }
        
        for(int y=0;y<j+1;y++)
        {
            System.out.print(a[y]+" ");
        }
        
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,4,4,5};
        removedup rd = new removedup();
        rd.reDup(a);
        
    }
}
