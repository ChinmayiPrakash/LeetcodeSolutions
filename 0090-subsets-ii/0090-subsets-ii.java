class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,new ArrayList<>(),nums,res);
        return res;
    }
    static void helper(int index, ArrayList<Integer> elist, int[] nums,List<List<Integer>> res){
        if(index== nums.length){
            ArrayList<Integer> temp = new ArrayList<>(elist);
            //Collections.sort(temp);
            if(!res.contains(temp)){
                res.add(temp );
                //return;
            }
            return;

        }
        //for (int i = index; i < nums.length; i++) {
            //if(i>index && nums[i]==nums[i-1]) break;

            elist.add(nums[index]);
            helper(index+1,elist,nums,res);
            elist.remove(elist.size()-1);
            helper(index+1,elist,nums,res);
       // }
    }
}