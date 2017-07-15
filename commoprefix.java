import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		String[] s = {"bedroom","bedclock","bedlight","be"};
		System.out.println("........answer : "+prefix(s));
	}
	
	
	static String prefix(String[] s){
	    String curr = s[0];
	    int i = 1;
	    while(i<s.length){
	        if(s[i].indexOf(curr) == 0){
	        System.out.println("printed base case");
	        i++;
	        continue;
	        }
	        while(curr.length()>0){
	            System.out.println("printed while : " + curr);
	            if(s[i].indexOf(curr) == 0){
	                System.out.println("printed while base case");
	                i++;
	                break;
	            }
	            else curr= curr.substring(0, curr.length() - 1);
	        }
	        //return null;
	   }
	    return curr;
	}
}