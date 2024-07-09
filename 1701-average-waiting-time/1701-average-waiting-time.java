class Solution {
    public double averageWaitingTime(int[][] customer) {
         int TT =0;
        double sum=0.0000;
       // int  avg = 0;
        for(int i = 0; i<customer.length;i++){
            int AT = customer[i][0];
            int ST = customer[i][1];

            TT = Math.max(TT,AT) + ST;
            int WT = TT-AT;
            sum = sum + WT;
        }
        int n = customer.length;
        double avg = sum/n;
       // String formattedNumber = String.format("%.5f", number);
        return avg;
        
    }
}