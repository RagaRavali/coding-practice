import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int[] a = {1,2,3,7};
		System.out.println("........answer"+square(a,6));
	}
	
	static boolean square(int[] a,int sum){
	    int m = a.length;
	    boolean[][] dp = new boolean[m+1][sum+1];
	    for(int i = 0;i<dp.length;i++){
	        dp[i][0]=true;
	    }
	    for(int i =1;i<dp.length;i++){
	        for(int j=1;j<dp[0].length;j++){
	            if(a[i-1]<=j){
	                dp[i][j] = dp[i-1][j]||dp[i-1][j-a[i-1]];
	            }
	            else dp[i][j] = dp[i-1][j];
	        }
	    }
	    
	    for(int i =0;i<dp.length;i++){
	        for(int j=0;j<dp[0].length;j++){
	            System.out.print(" "+dp[i][j]);
	        }
	        System.out.println();
	    }
	    
	    int i =dp.length-1;
	    int j = dp[0].length-1;
	    
	    while(i>0){
	        while(j>0){
	           // System.out.println("dfgshwjef");
	            if(dp[i][j] != dp[i-1][j]){
	                i--;
	                j=j-a[i];
	                System.out.println(""+i+" "+j+"..."+a[i]);
	            }
	            else i--;
	        }
	    }
	    
	            
	             
	    return dp[m][sum];
	}
}