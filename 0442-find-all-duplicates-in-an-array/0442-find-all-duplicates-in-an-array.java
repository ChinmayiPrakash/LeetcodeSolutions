class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      nums = func_disappearedElements(nums);
        return (findnotEqual(nums));
    }
   static int[] func_disappearedElements(int[] arr){
        int i = 0;
       while (i < arr.length){
           if(arr[i]==(i+1)){
               i++;
           }else {
               if(arr[i] == arr[arr[i]-1]){
                   i++;
               }else {
                   int m = arr[i]-1;
                   int temp = arr[i];
                   arr[i] = arr[m];
                   arr[m ] = temp;
               }
           }
       }
       return arr;
   }

   static ArrayList<Integer> findnotEqual(int[] arr){
        ArrayList<Integer> list = new ArrayList<>(10);
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] != i+1){
               list.add(arr[i]);
           }

       }
       return list;
   }
}
