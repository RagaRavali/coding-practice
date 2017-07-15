import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]){
        int[] a = {9,1,8,2,7,3,6,4,5,0};
        count(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
    static void count(int[] a){
        int[] c = new int[a.length+1];
        int[] b = new int[a.length+1];
        for(int i = 0;i<a.length;i++){
            int x = c[a[i]];
            x++;
            c[a[i]] = x;
            
        }
        for(int i = 1;i<c.length;i++){
            int x = c[i];
            c[i] = c[i-1]+x;
        }
        
        for(int i =0;i<b.length-1;i++){
            int x = c[a[i]];
            b[x] = a[i];
            x--;
            c[a[i]] = x;
        }
        for(int i = 1;i<b.length;i++){
            a[i-1] = b[i];
        }
        
    }
}
