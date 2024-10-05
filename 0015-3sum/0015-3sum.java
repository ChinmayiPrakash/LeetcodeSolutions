class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to use two-pointer technique

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int s = i + 1;
            int e = nums.length - 1;

            while (s < e) {
                int sum = nums[i] + nums[s] + nums[e];

                if (sum < 0) {
                    s++;  // Need a larger value
                } else if (sum > 0) {
                    e--;  // Need a smaller value
                } else {
                    // Found a valid triplet
                    res.add(Arrays.asList(nums[i], nums[s], nums[e]));

                    // Skip duplicates for s and e
                    while (s < e && nums[s] == nums[s + 1]) s++;
                    while (s < e && nums[e] == nums[e - 1]) e--;

                    s++;
                    e--;
                }
            }
        }
        return res;
       /* List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
             // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int s = i+1;
            int e = nums.length-1;
            while(s<e){
                int sum = nums[i]+nums[s]+nums[e];
                if(sum<0){
                    s++;
                }else if(sum>0){
                    e--;
                }else if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[s],nums[e]);
                    if(!res.contains(temp)){
                        res.add(temp);
                    }
                     // Skip duplicates for s and e
                    while (s < e && nums[s] == nums[s + 1]) s++;
                    while (s < e && nums[e] == nums[e - 1]) e--;
                    s++;
                    e--;
                    
                }
            }
        }
        return res;*/
    }
}