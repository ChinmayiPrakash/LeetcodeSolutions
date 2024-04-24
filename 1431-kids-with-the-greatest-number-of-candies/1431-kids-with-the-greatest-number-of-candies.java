class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getmax(candies);
        ArrayList<Boolean> op = new ArrayList<Boolean>(candies.length);
        for(int i = 0; i<candies.length ;i++){
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= max){
                op.add(true);
            }
            else{
                op.add(false);
            }
        }
        return op;
    }
    static int getmax(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}