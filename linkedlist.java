import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]){
        LL l = new LL();
        l.addAtBegin(5);
        l.addAtBegin(4);
        l.addAtBegin(3);
        l.addAtBegin(2);
        l.addAtBegin(1);
        l.addAtEnd(6);
        l.addAtIndex(4,10);
        l.delete(4);
        l.parse();
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LL{
    Node head;
    public LL(){
        head = null;
    }
    public boolean addAtBegin(int d){
        Node n = new Node(d);
        n.next = head;
        head = n;
        System.out.println("added");
        return true;
    }
    
    public boolean addAtEnd(int d){
        Node n = new Node(d);
        Node cur = new Node(0);
        cur.next = head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next = n;
        n.next = null;
        return true;
    }
    
    public boolean addAtIndex(int d, int find){
        Node n = new Node(d);
        Node cur = new Node(0);
        cur.next = head;
        while(cur.next!=null && cur.next.data != find){
            cur = cur.next;
        }
        n.next = cur.next;
        cur.next = n;
        return true;
    }
    
    public boolean delete(int find){
        Node curr = new Node(0);
        curr.next = head;
        while(curr.next != null && curr.next.data!=find){
            curr = curr.next;
        }
        if(curr.next == null){
            return true;
        }
        if(curr.next.next!=null){
            curr.next = curr.next.next;
            return true;
        }
        else{
            curr.next = null;
            return true;
        }
    }
    
    public void parse(){
        Node curr = head;
        //curr = curr.next;
        while(curr.next!=null){
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
        //System.out.println(curr.data);
    }
}