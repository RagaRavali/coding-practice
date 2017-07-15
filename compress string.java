import java.io.*;
import java.util.*;

//ask question like -- do i need to convert to same case or differentiate them?
//finally to avoid whole parsing, we can use a hash set to add the characters, once it's 2(length) > length ignore this.
class GFG {
	public static void main (String[] args) {
		//code
		String s = "raaaaGaaaa";
		System.out.println("........answer : "+comcount(s));
	}
	
	
	static String comcount(String s){
	    StringBuffer st = new StringBuffer();
	    int count = 1;
	    int len = s.length();
	    
	    for(int i =1;i<len;i++){
	        if(s.charAt(i)==s.charAt(i-1)){
	            count++;
	        }
	        else {
	            st.append(s.charAt(i-1));
	            st.append(count);
	            count = 1;
	        }
	    }
	    st.append(s.charAt(len-1));
	    st.append(count);
	    if(len>=st.length()){
	        return st.toString();
	    }
	    else return s;
	    
	}
}