package org.pkunray.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    private final SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

    @Test
    void subarraySumBruteForce() {
        assertEquals(10, subarraySumEqualsK.subarraySum(new int[]{1, 0, 1, 0,-1, 1}, 1));
    }

    @Test
    void subarraySumPrefixSum() {
        assertEquals(10, subarraySumEqualsK.subarraySum(new int[]{1, 0, 1, 0,-1, 1}, 1));
    }

    @Test
    void subarraySum() {
        assertEquals(10, subarraySumEqualsK.subarraySum(new int[]{1, 0, 1, 0,-1, 1}, 1));
    }
}