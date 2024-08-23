import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sorting the array to handle duplicates easily
        helper(0, nums, res);
        return res; 
    }

    static void helper(int index, int[] arr, List<List<Integer>> res) {
        if (index == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            res.add(new ArrayList<>(temp));
            return;
        }
        
        Set<Integer> used = new HashSet<>();
        for (int i = index; i < arr.length; i++) {
            // If the number has already been used in this position, skip it
            if (used.contains(arr[i])) {
                continue;
            }

            used.add(arr[i]);
            swap(i, index, arr);
            helper(index + 1, arr, res);
            swap(i, index, arr); // Backtrack to restore original array
        }
    }

    static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}