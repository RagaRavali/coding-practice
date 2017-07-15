import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]){
        int n = 2;
        Towers(n,"A","C","B");
    }
    static void Towers(int n,String source,String aux, String des){
        if(n ==0){
            return;
        }
        if(n==1){
            System.out.println("move the disk "+n+" from "+source+" to "+des);
            return;
        }
        Towers(n-1,source,des,aux);
        System.out.println("move the disk "+n+" from "+source+" to "+des);
        Towers(n-1,aux,source,des);
    }
}
