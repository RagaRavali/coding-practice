import java.io.*;
import java.util.*;

class GFG{
    public static void main(String[] args){
        int[] a = {2,1,4,3,8,4,7};
        Quick q = new Quick(a);
        q.quicksort(0,a.length-1,a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}

class Quick{
    int[] arr;
    Quick(int[] a){
        this.arr = a;
    }
    static void quicksort(int low, int high, int[] a){
        int p = low+(high-low)/2;
        int i = low;
        int j = high;
        int temp =0;
        while(i<=j){
            while(a[i]<a[p]){
                i++;
            }
            while(a[j]>a[p]){
                j--;
            }
            
            if(i<=j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if(i<=high){
            quicksort(low,j,a);
        }
        if(j>=low){
            quicksort(i,high,a);
        }
    }
}
    
    