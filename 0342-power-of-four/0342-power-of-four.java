class Solution {
    public boolean isPowerOfFour(int n) {
        double val = helperfunc(n);
         Boolean result = false;
         if(val==0.0){
             result =  false;
         }
         if(val==1.0){
             result =  true;
         }
         return result;
    }
     static double helperfunc(double n){
        if(n==0.0){
            return 0;
        }
        if(n==1.0){
            return 1;

        }
        return helperfunc(Double.valueOf(n)/4.0);
    }
}