class Solution {
    public int findDuplicate(int[] nums) {
        
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

    static int findnotEqual(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return arr[i];
            }

        }
        return -1;
    }
}
