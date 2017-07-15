import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]){
        
        parant("",3,3);
    }
    static void parant(String s, int close,int open){
        if(open == 0 && close ==0){
            System.out.println(s);
        }
        if(open>close){
            return;
        }
        if(open>0){
            parant(s+"(",close,open-1);
        }
        if(close>0){
            parant(s+")",close-1,open);
        }
    }
}
