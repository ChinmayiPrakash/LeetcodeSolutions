class Solution {
    public int firstMissingPositive(int[] arr) {
            arr = cyclicSort(arr);
        return ((FirstMissingPositive(arr)));

    }
    static int[] cyclicSort(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i<n){
            if(arr[i]<=0 || arr[i]>n){
                i++;
            }
            else {
                if(arr[i]==i+1){
                    i++;
                }
                else {
                    int m = arr[i]-1;
                    if(arr[i] == arr[m]){
                        i++;
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[m];
                        arr[m] = temp;
                    }
                }
            }
        }
        return arr;
    }
    // after cyclic sort whichever index doesn't match with element return index + 1. if //matches , return last matching element + 1
    static int FirstMissingPositive(int[] arr) {
        int val = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] != i+1){
                return (i+1);
            }
            else{
                val = arr[i]+1;
            }

        }
        return val;
    }
}
