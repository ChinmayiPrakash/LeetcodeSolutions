class Solution {
    // here we need to avoid repeated list elements which sum up to target for example {1,1,2},{1,1,2} is not allowed, so avoid picking index of adjacent same elements.and if elements at starting index which is at 0 and 1 are same , we should consider , we try to pick elements from start to end of array so we are looping from particular index till last index of array.
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    
        List<Integer> elist = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        //sorting here just to get elements in list to be in sorted manner and also to avoid repetiotion of subsets.
        Arrays.sort(candidates);
        helper(0,elist,target,candidates,res);
        return res;
    }
     public static void helper(int index,List<Integer> emptylist,int target,int[] arr,List<List<Integer>> res){
       
          if(target==0){
           res.add(new ArrayList<>(emptylist));
         return;

        }
       //Now loop through index to end of array here i>index is checked to if elements at starting index which is at 0 and 1 are same , we should consider ,
         for(int i = index; i<arr.length;i++){
             if(i>index && arr[i]==arr[i-1]) continue;
             if(target<arr[i])break;
             
             emptylist.add(arr[i]);
            //not incrementing current index just to consider same element more than once to get required target
            helper(i+1,emptylist,(target-arr[i]),arr,res);
            //removing an element
            emptylist.remove(emptylist.size()-1);
         }
       



    }
}