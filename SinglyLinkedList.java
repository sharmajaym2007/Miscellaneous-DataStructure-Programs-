/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Scanner;
import sun.management.Agent;

/**
 *
 * @author Jay Sharma
 */
class Node{
    
    int data;
    Node link;
    
    Node()
    {
        data= 0;
        link=null;
    }
    Node(int data,Node link)
    {
        this.data=data;
        this.link=link;
    }
    
    void setLink(Node link)
    {
        this.link=link;
    }
    
    
    Node getLink()
    {
        return link;
    }
    
    void setData(int data)
    {
        this.data=data;
    }
    
    int getData()
    {
        return data;
    }
    
}

class LinkedList{
Node start;
Node end;
int size;

int count1=1;

    LinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    
    boolean isEmpty()
    {
        return start == null;
    }
    
    int getSize()
    {
        return size;
    }
    
    void insertAtStart(int value)
    {
        Node n = new Node(value, null);
        size++;
        if(start == null)
                {
                    start = n;
                    end = start;
                }
        else
        {
            n.setLink(start);
            start = n;
        }
    }
    
    
    void insertAtEnd(int value)
    {
        Node n = new Node(value, null);
        size++;
        
        if(start == null)
        {
            start = n;
            end = start;
        }
        else
        {
            end.setLink(n);
            end = n;
        }
    }
    
    
    void insertAtPos(int value, int pos)
    {
        pos = pos-1;
        Node n = new Node(value, null);
        Node ptr = start;
        for(int i = 1; i<size; i++)
        {
            if(i == pos)
            {
                Node tmp = ptr.getLink();
                ptr.setLink(n);
                n.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }
    
    void deleteAtPos(int num)
    {
        if(num == 1)
        {
            start = start.getLink();
            size --;
        }
        if(num == size)
        {
            Node s=start,e=start;
            while(e != end)
            {
                s = e;
                e = e.getLink();
            }
            end = s;
            end.setLink(null);
            size --;
        }
        
        
        Node ptr = start;
        num = num -1;
        
        for(int i=1; i<size; i++)
        {
            if(num == i)
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }

void display()
{
    if(size == 0)
    {
        System.out.println("Empty Linked List");
    }
    else if(start.getLink() == null)
    {
        System.out.println("Linked List is"+start.getData());
    }
    else
    {
       Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while(ptr.getLink()!= null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData());
    }
}

int elementSearch(int value)
{
    int count =1;
    Node ptr = start;
    if(start.data == value)
    {
        return count;
    }
    else 
    {
        ptr = ptr.link;
        while(ptr.link!=null)
        {
            if(ptr.data == value)
            {
                return count+1;
            }
            count++;
            ptr = ptr.link;
        }
        if(ptr.data !=value)
        {
            return -1;
        }
    }
    return count+1;
}
    


}    

public class SinglyLinkedList {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList l =new LinkedList();
        char ch;
        do{
        
        
        System.out.println("1. Insert at Begining"+"\n");
        System.out.println("2. Insert at End"+"\n");
        System.out.println("3. Insert at a Particular Position"+"\n");
        System.out.println("4. Delete from a position"+"\n");
        //System.out.println("5. Display Linked List"+"\n");
        System.out.println("5. Check Empty"+"\n");
        System.out.println("6. Get Size"+"\n");
        System.out.println("7. Element to Search");
        
        int choice= scan.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter Element to insert\n");
                l.insertAtStart(scan.nextInt());
                break;
                
            case 2:
                System.out.println("Enter Element to insert\n");
                l.insertAtEnd(scan.nextInt());
                break;
                
            case 3:
                System.out.println("Enter Element to insert\n");
                int ele = scan.nextInt();
                System.out.println("Enter Position\n");
                int pos = scan.nextInt();
                if(pos<1 || pos > l.getSize())
                {
                    System.out.println("Invalid Position");
                }
                else
                {
                l.insertAtPos(ele,pos);
                }
                break;
                
            case 4:
                System.out.println("Enter position");
                int pos1 = scan.nextInt();
                if(pos1 > l.getSize() || pos1<1)
                {
                     System.out.println("Invalid Position");
                }
                else
                {
                    l.deleteAtPos(pos1);
                }
                break;
            case 5:
                System.out.println("Empty Status: "+l.isEmpty());
                break;
            case 6:
                System.out.println("Size: "+l.getSize());
                break;
            case 7:
                System.out.println("Enter element to be searched");
                int val = scan.nextInt();
                int pos2 = l.elementSearch(val);
                if(pos2 == -1)
                {
                    System.out.println("Value\t"+val+"\tnot found");
                }
                else
                {
                System.out.println("Your Element\t"+val+ "\tis at\t"+pos2+"\tPosition");
                }
                break;
            
            default:
                System.out.println("Enter Correct Entry");
                break;
                    
        }
        l.display();
        System.out.println("Do you want to continue: Yes(Y) or No(N)");
        ch = scan.next().charAt(0);
    }while(ch == 'Y' || ch == 'y');
    
    }
    
    
}
