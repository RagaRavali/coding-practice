import java.io.*;
import java.util.*;

class GFG{
    public static void main(String[] args){
        track t = new track();
        t.insert(10);
        t.insert(8);
        t.insert(7);
        t.insert(14);
        System.out.println(t.max());
        t.remove();
        System.out.println(t.max());
    }
}

class track{
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> t = new Stack<Integer>();
    public void insert(int n){
        //Integer x = new Integer(n);
        if(st.isEmpty()){
            st.push(n);
            t.push(n);
        }
        st.push(n);
        t.push(Math.max(t.peek(),n));
    }
    public void remove(){
        st.pop();
        t.pop();
    }
    public int max(){
        return t.peek();
    }
}