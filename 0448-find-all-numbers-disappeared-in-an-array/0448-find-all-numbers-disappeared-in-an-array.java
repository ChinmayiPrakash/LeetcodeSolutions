//using Cyclic sort in this code.
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //sort elements based on index such that nums[i] == i+1
       nums = func_disappearedElements(nums);
        //missing elements are found when nums[i] != i+1
        return (findnotEqual(nums));
    }
    
   static int[] func_disappearedElements(int[] arr){
        int i = 0;
       while (i < arr.length){
           
           if(arr[i]==(i+1)){
               //if element at index == number considering base 1 array.
               i++;
           }else {
               if(arr[i] == arr[arr[i]-1]){
                  // if element is equal at ith and current position increment
                   i++;
               }else {
                   // correct index of current element is stored in variable as it may //change when elements are swapped
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
               list.add(i+1);
           }

       }
       return list;
   }
}
