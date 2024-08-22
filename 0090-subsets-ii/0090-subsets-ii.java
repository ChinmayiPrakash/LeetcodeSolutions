class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,new ArrayList<>(),nums,res);
        return res;
    }
    static void helper(int index, ArrayList<Integer> elist, int[] nums,List<List<Integer>> res){
       res.add(new ArrayList<>(elist) );
        for (int i = index; i < nums.length; i++) {
            if(i!=index && nums[i]==nums[i-1]) continue;

            elist.add(nums[i]);
            helper(i+1,elist,nums,res);
            elist.remove(elist.size()-1);
            //helper(index+1,elist,nums,res);
        }
    }
}