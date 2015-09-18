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
public class Arraytwosum {
    
    
    
    
    public int hasArrayTwo(int arr[],int sum)
    {
        Arrays.sort(arr);
        int l =0;
        int r = arr.length-1;
        while(l<r)
        {
            if(arr[l]+arr[r]==sum)
            {
                return 1; 
            }
            else if(arr[l]+arr[r]<sum)
            {
                l++;
                
            }
            else
            {
                r++;
            }
            
            
        
        }
        return 0;
        
    }
    
    
    public static void main(String[] args) {
        Arraytwosum ats = new Arraytwosum();
        int arr[]={3,1,7,5,12};
        System.out.println(ats.hasArrayTwo(arr, 19));
    }
    
}
