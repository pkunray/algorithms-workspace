package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/subarray-sum-equals-k/">LeetCode 560</a>
 * <a href="https://leetcode.cn/problems/subarray-sum-equals-k/solution/bao-li-jie-fa-qian-zhui-he-qian-zhui-he-you-hua-ja/">Recommended Solution</a>
 */
public class SubarraySumEqualsK {
    /**
     * Brute force.
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     *
     * @param nums
     * @param k
     * @return the total number of subarrays whose sum equals k.
     */
    public int subarraySumBruteForce(int[] nums, int k) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                total++;
            }
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    total++;
                }
            }
        }
        return total;
    }

    /**
     * Prefix Sum.
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     *
     * @param nums
     * @param k
     * @return the total number of subarrays whose sum equals k.
     */
    public int subarraySumPrefixSum(int[] nums, int k) {
        int total = 0;
        int length = nums.length;
        int[] prefixSum = new int[length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (prefixSum[j + 1] - prefixSum[i] == k) {
                    total++;
                }
            }
        }
        return total;
    }

    /**
     * Prefix Sum plus Hashtable.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param nums
     * @param k
     * @return the total number of subarrays whose sum equals k.
     */
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        Map<Integer, Integer> prefixSumCountMap = new HashMap<>();
        prefixSumCountMap.put(0, 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (prefixSumCountMap.get(sum - k) != null) {
                total += prefixSumCountMap.get(sum - k);
            }
            prefixSumCountMap.put(sum, prefixSumCountMap.getOrDefault(sum, 0) + 1);
        }
        return total;
    }
}
