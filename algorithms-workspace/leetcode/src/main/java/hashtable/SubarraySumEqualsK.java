package hashtable;

/**
 * <a href="https://leetcode.com/problems/subarray-sum-equals-k/">LeetCode 560</a>
 */
public class SubarraySumEqualsK {
    // Time Limit Exceeded, needs optimization
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                total++;
            }
            int sum = nums[i];
            int j = i;
            while (j < nums.length - 1) {
                j++;
                sum += nums[j];
                if (sum == k) {
                    total++;
                }
            }
        }
        return total;
    }

}
