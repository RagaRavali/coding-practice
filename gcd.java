import java.util.*;
import java.io.*;
class GFG{
    public static void main(String[] args){
        int a = 156;
        int b = 282;
        System.out.println(gcd(a,b));
    }
    static int gcd(int x, int y){
        System.out.println(x+" "+y);
        int i = Math.max(x,y);
        int j = Math.min(x,y);
        if(j==0){
            return x;
        }
        return gcd(j,i-j);
    }
}