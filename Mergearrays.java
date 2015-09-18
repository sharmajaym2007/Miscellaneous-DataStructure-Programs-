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
public class Mergearrays {
    
    // a ={4,5,7,9}
    // b = {1,3,6,8,9}
    // ans - {1,3,4,5,6,7,8,9,9}
    
    
    public void mergearr(int a[],int m, int b[], int n)
    {
        while(m>0 && n>0)
        {
            if(a[m-1]>b[n-1])
            {
                a[m+n-1] = a[m-1];
                m--;
            }
            else
            {
                a[m+n-1]=b[n-1];
                n--;
            }
        } 
            while(n > 0){
            a[m+n-1] = b[n-1];
            n--;
            }
            
        
           
        
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    
    
    public static void main(String[] args) {
        
        int a[]=new int[50];
        a[0]=1;
        a[1]=3;
        a[2]=6;
        a[3]=8;
        a[4]=9;
        
        
        
        
        int b[]=new int[50];
        b[0]=9;
        b[1]=9;
        b[2]=9;
        b[3]=9;
        
        Mergearrays ma = new Mergearrays();
        ma.mergearr(a, 5, b, 4);
        
        
    }
    
    
    
    
}
