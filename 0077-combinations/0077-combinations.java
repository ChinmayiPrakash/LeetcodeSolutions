class Solution {
    //mycode
   /* public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> res = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        helper(k,0,new ArrayList<>(),arr,res);
        return res;
    }
    static void helper(int k ,int index, List<Integer> elist,int[] arr,List<List<Integer>> res){
        if(index>= arr.length){
            if(elist.size()==k){
                res.add(new ArrayList<>(elist));
            }

            return;
        }
        elist.add(arr[index]);
        helper(k,index+1,elist,arr,res);
        elist.remove(elist.size()-1);
        helper(k,index+1,elist,arr,res);
    }*/
    //Optimized code
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        helper(k,1,new ArrayList<>(),n,res);
        return res;
    }
    static void helper(int k ,int index, List<Integer> elist,int n,List<List<Integer>> res){
        //if(index>= arr.length){
            if(elist.size()==k){
                res.add(new ArrayList<>(elist));
                return;
            }


        for (int i = index; i <=n; i++) {
            elist.add(i);
            helper(k,i+1,elist,n,res);
            elist.remove(elist.size()-1);
        }

        // helper(k,index+1,elist,arr,res);
    }
}