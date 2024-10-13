class Solution {
   /* int solve(int i,int[] cost,int[] dp){
        this can be done in recurssion also whose 
        TC = 2^n
        //This is recurssion + memoization method
        TC = O(N)
        SC = O(N)//dp array
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a = cost[i] + solve(i+1,cost,dp);
        int b = cost[i] + solve(i+2,cost,dp);

        return dp[i] = Math.min(a,b);
    }*/



    public int minCostClimbingStairs(int[] cost) {
        /*
        Below code is for recurssion + memoizatuion 
        TC = O(N)
        SC = O(N)//dp array
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));*/
        int n = cost.length;
        if(n ==2){
            return Math.min(cost[0],cost[1]);
        }
        for(int i=2 ;i<cost.length ;i++){
            cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);

            
        }
        return 0 + Math.min(cost[n-1],cost[n-2]);
    }
}