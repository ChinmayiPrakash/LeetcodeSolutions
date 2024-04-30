class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1 ;
        int max = 0,temp=0;
        int l=0;
        boolean status = false;
        while(i != j) {

            if (height[i] > height[j]) {
                l = height[j];
                temp = l * (j - i);
                j--;
            } else if (height[i] < height[j]) {
                l = height[i];
                temp = l * (j - i);
                i++;
            } else {
                 if (height[i + 1] < height[i]) {
                    l = height[i];
                    temp = l * (j - i);
                    i++;
                } else if (height[j - 1] < height[j]) {
                    l = height[i];
                    temp = l * (j - i);
                    j--;
                }
                else{
                    if(height[i+1]>height[j-1]){
                    l = height[i];
                    temp = l * (j - i);
                    j--;
                }
                else{
                    l = height[i];
                    temp = l * (j - i);
                    i++;
                }

                }
                
            }
            if (temp > max) {
                max = temp;
            }

        }

        return max;
    


    }


}