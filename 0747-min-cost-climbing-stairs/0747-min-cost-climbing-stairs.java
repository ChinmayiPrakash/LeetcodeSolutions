class Solution {
    int solve(int i,int[] cost,int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a = cost[i] + solve(i+1,cost,dp);
        int b = cost[i] + solve(i+2,cost,dp);

        return dp[i] = Math.min(a,b);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
}