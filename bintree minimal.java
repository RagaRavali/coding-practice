import java.io.*;
import java.util.*;

class GFG{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        bin(a,0,a.length-1);
    }
    
    static Node bin(int[] a,int left,int right){
        int mid = left + (right-left)/2;
        if(left> right){
            return null;
        }
        Node root = new Node(a[mid]);
        System.out.println(a[mid]);
        root.left = bin(a,left,mid-1);
        root.right = bin(a, mid+1,right);
        return root;
    }
}

class Node{
    int data;
    Node right;
    Node left;
    Node(int n){
        this.data = n;
        this.left = null;
        this.right = null;
    }
}

