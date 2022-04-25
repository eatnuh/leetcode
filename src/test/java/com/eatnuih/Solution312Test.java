package com.eatnuih;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution312Test {

    Solution312 solution = new Solution312();

    @Test
    void testcase1() {
        int expected = 167;
        int actual = solution.maxCoins(new int[]{3, 1, 5, 8});

        assertEquals(expected, actual);
    }

}