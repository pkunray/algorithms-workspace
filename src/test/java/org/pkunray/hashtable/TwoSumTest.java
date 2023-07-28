package org.pkunray.hashtable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void twoSum() {
        assertArrayEquals(Arrays.stream(new int[]{0, 1}).sorted().toArray(),
                Arrays.stream(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)).sorted().toArray());
    }
}