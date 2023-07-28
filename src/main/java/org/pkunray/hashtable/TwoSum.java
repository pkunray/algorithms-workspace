package org.pkunray.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">LeetCode 1</a>
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsHash.containsKey(target - nums[i])) {
                return new int[]{i, numsHash.get(target - nums[i])};
            } else {
                numsHash.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
