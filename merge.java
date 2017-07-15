import java.io.*;
import java.util.*;

class GFG{
    public static void main(String[] args){
        int[] a = {1,5,4,3,7};
        //int[] b ;
        System.out.println("answer : ");
        mergesort(0,a.length-1,a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    static void mergesort(int low,int high,int[] a){
        int mid = low+(high-low)/2;
        if(low<high){
            mergesort(low, mid, a);
            mergesort(mid+1, high, a);
            merge(low,mid,high,a);
            for(int i = 0;i<a.length;i++){
            System.out.print(a[i]);
            }
            System.out.println();
        }
    }
    
    static void merge(int low, int mid, int high,int[] b){
        int[] a = new int[b.length];
        for (int i = low; i <= high; i++) {
		    a[i] = b[i];
	    }
        int i = low;
        int j = mid+1;
        int k = low;
        while(i<=mid && j<=high){
            if(b[i]<= b[j]){
                a[k] = b[i];
                i++;
            }
            else{
                a[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<=mid && k<=high){
            a[k]=b[i];
            i++;
            k++;
        }
        
        for(int z= low;z<=high;z++){
            b[z]=a[z];
        }
    }
}