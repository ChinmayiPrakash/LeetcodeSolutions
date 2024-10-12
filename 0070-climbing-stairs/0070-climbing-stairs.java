class Solution {
public int climbStairs(int n) {
    // we reduced code from recurssion to memoization then to tabulation then to space complexity reduction
int prev2 =1;//this is for n==0;
int prev =1;//this is for n==1;
if(n==1 || n==0){
    return prev;
}
int cur =-1;
for(int i =2;i<=n;i++){
     cur = prev2 + prev;
    prev2 = prev;
    prev = cur;
}
return cur;
}

    /*
    this soln gave time limit exceeded 
    public int climbStairs(int n) {
        int[] dp = new  int[n+1];
        Arrays.fill(dp,-1);
        return calsteps(dp,n);
    }
    int calsteps(int[] dp, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        int left = calsteps(dp,n-1);
        int right = calsteps(dp,n-2);

        if(dp[n]==-1){
            dp[n]=left + right;

        }
        return dp[n];

    }*/
}