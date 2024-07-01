class Solution {
    public boolean isHappy(int val) {
    int slow = val;
     int fast = val;
     do{
        slow = findNumber(slow);
        fast = findNumber(findNumber(fast));

     }while(fast !=slow);
     if(slow == 1){
         return true;
     }
     return false;
}
static int findNumber(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans + (rem * rem);
            n = n/10;
        }
        return ans;
    }

}
    