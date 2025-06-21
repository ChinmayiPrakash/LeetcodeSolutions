class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Convert nums array to a string of '0's and '1's
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        String str = sb.toString();

        // Split the string by '0' to get sequences of consecutive '1's
        String[] arr = str.split("0");

        int max = 0; // max length of consecutive ones

        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        return max;
    }
}
