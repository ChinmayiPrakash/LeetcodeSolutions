class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0;i< image.length;i++){
           image[i] = reverseArray(image[i]);
            System.out.println(Arrays.toString(image[i]));
        }

        return image;
    }
    static int[] reverseArray(int[] arr){
        int l= 0, r = arr.length-1;

        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }

        return arr;

    }
}