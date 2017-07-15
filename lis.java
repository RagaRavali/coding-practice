import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int[] a = {3,1,4,5,2};
		System.out.println("........answer"+lis(a));
	}
	
	static int lis(int[] a){
	    int[] dp = new int[a.length];
	    dp[0] = 0;
	    int x = 0;
	    for(int i =1;i<a.length;i++){
	        int max = -1;
	        for(int j = 0;j<i;j++){
	            //System.out.print(" "+a[j]+".."+a[i-1]);
	            
	            if(a[j]<a[i]){
	                if(1+dp[j] > max|| max == -1){
	                    max = 1+dp[j];
	                }
	            }
	            
	        }
	        System.out.println("....."+a[i-1]); 
	        if(max == -1) max = 1;
	        dp[i] = max;
	        //System.out.println("max " + dp[i]);
	    }
	    int ans = 1;
	    for(int i=0;i<dp.length;i++){
	        System.out.print("  "+dp[i]);
	        if(dp[i]>ans){
	            ans = dp[i];
	        }
	    }
	    return ans;
	}
}