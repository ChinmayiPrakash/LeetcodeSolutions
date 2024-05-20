class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(m!=0 && n!=0) {
            int[] temp = new int[m + n];
            int i = 0, j = 0;
            for (int k = 0; k < m + n; k++) {
                if (i >= m) {
                    temp[k] = nums2[j];
                    j++;
                } else if (j >= n) {
                    temp[k] = nums1[i];
                    i++;
                } else {
                    if (nums1[i] == nums2[j]) {
                        temp[k] = nums1[i];
                        i++;
                        k = k + 1;
                        temp[k] = nums2[j];
                        j++;

                    } else if (nums1[i] < nums2[j]) {
                        if (nums1[i] == 0 && i>=m) {
                            temp[k] = nums2[j];
                            j++;
                        } else {
                            temp[k] = nums1[i];
                            i++;
                        }
                    } else {
                        temp[k] = nums2[j];
                        j++;
                    }
                }
            }
            for( i = 0;i<temp.length;i++){
                nums1[i] = temp[i];
            }
            System.out.println(Arrays.toString(nums1));
        } else if (n==0) {
            nums1=nums1.clone();
            System.out.println(Arrays.toString(nums1));
        } else if (m==0) {
            for(int i = 0;i<nums2.length;i++){
                nums1[i] = nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
        }

    }
}
