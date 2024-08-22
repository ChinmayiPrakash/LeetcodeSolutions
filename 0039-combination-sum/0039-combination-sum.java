class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> elist = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(0,elist,target,candidates,res);
        return res;
    }
     public static void helper(int index,List<Integer> emptylist,int target,int[] arr,List<List<Integer>> res){
        if(index==(arr.length)){
          if(target==0){
            res.add(new ArrayList<>(emptylist));

        }
        return;}
        if(target>=arr[index]){
            emptylist.add(arr[index]);
            helper(index,emptylist,(target-arr[index]),arr,res);
            emptylist.remove(emptylist.size()-1);
        }

        helper(index+1,emptylist,target,arr,res);



    }
}