class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        int[] marker = new int[nums.length];
        helper(new ArrayList<>(),marker,nums,res);
        return res;
    }
     static void helper(List<Integer> elist,int[] marker,int[] arr,List<List<Integer>> res){
        if (elist.size()==arr.length){
            res.add(new ArrayList<>(elist));
            return;
        }
       for (int i = 0; i < arr.length; i++) {
           if(marker[i]==0){
               elist.add(arr[i]);
               marker[i]=1;
               helper(elist,marker,arr,res);
               elist.remove(elist.size()-1);
               marker[i]=0;
               //helper(elist,index+1,marker,arr,res);
           }
       }

    }
}