import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		String s = "Iamace";
		HashSet<String> h = new HashSet<String>();
		h.add("I");
		h.add("am");
		h.add("ace");
		h.add("a");
		System.out.println("........answer"+wordbreak(s,h));
	}
	
	static int wordbreak(String s, HashSet<String> h){
	    int[][] dp = new int[s.length()][s.length()];
	    //dp[0] = 0;
	    for(int i = 0;i<s.length();i++){
	        for(int j = 0;j<s.length();j++){
	            dp[i][j] = -1;
	        }
	    }
	    
	    for(int l = 1;l<=s.length();l++){
	        for(int i = 0;i<s.length()-l+1;i++){
	            int j = l+i-1;
	            String str = s.substring(i,j+1);
	            if(h.contains(str)){
	                dp[i][j] = i;
	                continue;
	            }
	            //int max = 0;
	            for(int k =i;k<j;k++){
	                //System.out.println("check"+i+","+k+"  "+(k+1)+","+j);
	                if(dp[i][k]!= -1 && dp[k+1][j] != -1 ){
	                    dp[i][j] = k;
	                    break;
	                }
	                 
	            }
	        }
	    }
	    
	    for(int i = 0;i<s.length();i++){
	        for(int j = 0;j<s.length();j++){
	            System.out.print("  "+dp[i][j]);
	        }
	        System.out.println();
	    }
	    
	    //StringBuffer buffer = new StringBuffer();
        int j = s.length()-1;
        int i = j; 
        while(i >=0){
            int k = dp[i][j];
            if(k == -1){
                i--;
            }
            else {
                System.out.println(""+s.substring(i,j+1));
                j = j-k;
                i = j;
            };
        }
	    
	   // System.out.println(""+buffer.toString());
        
	    return dp[0][s.length()-1];
	}
}