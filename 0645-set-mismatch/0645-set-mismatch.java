class Solution {
    public int[] findErrorNums(int[] arr) {
       arr = Func_CyclicSort(arr);
        return (Func_CheckForValue(arr));
    }
    static int[] Func_CyclicSort(int[] arr){
        int i =0;
        while(i< arr.length){
            if(arr[i] == i+1){
                i++;
            }
            else {
                int m = arr[i]-1;
                if(arr[i] ==arr[m]){
                    i++;
                }
                else {
                    int temp = arr[i];
                    arr[i] = arr[m];
                    arr[m] = temp;
                }
            }
        }
        return arr;

    }
    static int[] Func_CheckForValue(int[] arr){
       int[] list = new int[2];
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] != (i+1)){
                list[0] =(arr[i]);
                list[1] = (i+1);
            }
        }
        return list;
    }
}
