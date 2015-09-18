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

interface jay1{
    int MIN=1;
   void print();
    
    
}

class sam1 implements jay1
{

    @Override
    public void print() {
       
        //System.out.println("In Print");
        //System.out.println(MIN);
        
    }
}


public class Sample {
    
    public static void main(String[] args) {
        sam1 s=new sam1();
        s.print();
    
    
        int a[]=new int[5];
        a[0]=5;
        a[1]=10;
        a[2]=15;
        
        
        for(int i=0;i<a.length;i++)
        {
            //System.out.println("Element at position "+(i+1)+" is "+a[i]);
        }
        
        ArrayList<Integer> mix=new ArrayList();
        mix.add(1);
        mix.add(2);
        /*
        for(int i=0;i<mix.size();i++)
        {
            System.out.println("Element at position "+(i+1)+" is "+mix.get(i));
        }
                */
        
        for(int i : mix)
        {
            int i1= mix.indexOf(i);
        //    System.out.println("Element at position "+i1+" is "+i);
        }
        
        
        HashSet a1=new HashSet();
        a1.add(2);
        a1.add(3);
        
        
        Iterator i= a1.iterator();
        
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
        TreeSet<Integer> t=new TreeSet();
        t.add(1);
        t.add(4);
        t.add(3);
        
        Iterator itr=t.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        LinkedHashSet<Integer> lhs=new LinkedHashSet();
        lhs.add(2);
        lhs.add(3);
        
        
        Iterator itr1=lhs.iterator();
        
        while(itr1.hasNext())
        {
            System.out.println("fsa"+itr1.next());
        }
        
        
        HashMap<String, Integer> hm = new HashMap();
        
        hm.put("Jay",1);
        hm.put("Sandeeep",1);
        hm.put("Sharma",2);
        
        
        Set set = hm.entrySet();
        
        Iterator itr2 = set.iterator();
        
        
        while(itr2.hasNext())
        {
            System.out.println("sdkakldsa"+itr2.next());
        }
        
        
        TreeMap tm=new TreeMap();
        
        tm.put("mother", "fucker");
        tm.put("ass", "hole");
        
        Set set1=tm.entrySet();
        
        Iterator itr3 = set1.iterator();
        
        while(itr3.hasNext())
        {
            System.out.println("s "+itr3.next());
        }
        
        
    }
    
    
    
    
    
    
}
