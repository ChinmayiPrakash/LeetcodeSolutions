class Solution {
    public int maxArea(int[] height) {
        //Here we are using two pointers approach where s =0 e = height.length-1
        //move which ever value is lower 
        //But when the values are equal move pointer with greater height
        // calculate area at every stage and compare.

        int max_area = 0,area =0;
        int s = 0;
        int e = height.length-1;
        while(s<e){
            if(height[s]<height[e]){
                area = (height[s] * (e-s));
                s++;
            }else if(height[s]>height[e]){
                area = (height[e] * (e-s));
                e--;
            }else if(height[s]==height[e]){
                area = (height[s] * (e-s));
                if(s+1 < e-1){
                    if(height[s+1]>height[e-1]){
                    s++;
                }else if(height[s+1]<height[e-1]){
                    e--;
                }else{
                    s++;
                }
                }else{
                    s++;e--;
                }
                
            }
            max_area = Math.max(max_area,area);
        }
        return max_area;
    }
}