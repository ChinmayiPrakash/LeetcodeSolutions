import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return res; // If finalSum is odd, return an empty list
        }

        long current = 2; // Start with the smallest even number
        while (finalSum - current >= current + 2) {
            res.add(current);
            finalSum -= current;
            current += 2;
        }

        res.add(finalSum); // Add the remaining sum as the last even number
        return res;
    }
}
/*Explanation of Optimized Solution:
Direct Check for Odd Numbers: Immediately returns an empty list if finalSum is odd.
Iterative Addition of Even Numbers: Adds even numbers sequentially until the remaining finalSum is less than the next even number.
Efficient Calculation: Ensures the sum is achieved in the least number of steps without exploring all combinations.
This solution runs in O(√n) time complexity due to the loop, which is much more efficient than the backtracking approach, especially for large values of finalSum.*/









