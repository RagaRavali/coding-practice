import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int[][] a = {{0,1,0,1,0,1},{1,0,1,0,1,0},{0,1,1,1,1,0},{1,0,1,1,1,0},{1,1,1,1,1,1}};
		System.out.println("........answer"+square(a));
	}
	
	static int square(int[][] a){
	    int m = a.length;
	    int n = a[0].length;
	    int[][] dp = new int[m][n];
	    for(int i = 0;i<m;i++){
	        if(a[i][0] == 0)
	            dp[i][0] = 0;
	        else dp[i][0] = 1;
	    }
	    for(int i = 0;i<n;i++){
	        if(a[0][i] == 0)
	            dp[0][i] = 0;
	        else dp[0][i] = 1;
	    }
	    
	    for(int i=1;i<m;i++){
	        for(int j = 1;j<n;j++){
	            if(a[i][j] == 0){
	                dp[i][j]=0;
	            }
	            else dp[i][j] = 1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
	        }
	    }
	    int max = 0;
	    for(int i=0;i<m;i++){
	        for(int j = 0;j<n;j++){
	            System.out.print(" "+dp[i][j]);
	            if(dp[i][j]>max){
	                max = dp[i][j];
	            }
	        }
	        System.out.println();
	    }
	    return max;
	}
}