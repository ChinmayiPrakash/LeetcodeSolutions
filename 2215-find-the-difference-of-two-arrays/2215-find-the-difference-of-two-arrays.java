class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>()); // res.get(0) will store elements in nums1 not in nums2
        res.add(new ArrayList<>()); // res.get(1) will store elements in nums2 not in nums1

        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                res.get(0).add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                res.get(1).add(num);
            }
        }

        return res;
    }
}