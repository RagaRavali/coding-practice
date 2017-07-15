import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int[] coins = {1,5,6,8};
		int amount = 11;
		System.out.println(""+mc(coins,amount));
	}
	
	static int mc(int[] coins,int amount){
	    int[][]dp = new int[coins.length+1][amount+1];
	    
	    //initial base case filling..that is 1st coin is filled manually.
	    int x = coins[0];//x is first coin
	    for(int k = 0;k<amount+1;k++){
	        dp[0][k] = Integer.MAX_VALUE;
	    }
	    
	    for(int i =1;i<=coins.length;i++){
	        for(int j = 1;j<=amount;j++){
	            if(j>=coins[i-1]){
	                dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
	            }
	            else dp[i][j] = dp[i-1][j];
	        }
	    }
	    for(int a = 0;a<dp.length;a++){
	        for(int b = 0;b<dp[0].length;b++){
	            System.out.print(" "+dp[a][b]);
	        }
	        System.out.println();
	    }
	    
	    //print what coins i am taking-
	    int i = coins.length;
	    int j = amount;
	    while(i>1){
	        while(j>1){
	            if(dp[i][j]==dp[i-1][j]){
	                i = i-1;
	            }
	            else{
	                System.out.println("..........."+coins[i-1]);
	                j = j-coins[i-1];
	            }
	        }
	    }
	    return dp[coins.length-1][amount];
	}
}