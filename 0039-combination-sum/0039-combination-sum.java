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
         //consider only when target is greater than element at that index
        if(target>=arr[index]){
            //taking an element
            emptylist.add(arr[index]);
            //not incrementing current index just to consider same element more than once to get required target
            helper(index,emptylist,(target-arr[index]),arr,res);
            //removing an element
            emptylist.remove(emptylist.size()-1);
        }
        //increment index to consider next element
        helper(index+1,emptylist,target,arr,res);



    }
}