class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length != target.length){
            return false;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(target);
        System.out.println(Arrays.toString(target));
        if(Arrays.equals(arr,target)){
            return true;
        }
        else{
            return false;
        }
    }
}