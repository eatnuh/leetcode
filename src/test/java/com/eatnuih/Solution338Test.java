package com.eatnuih;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution338Test {
    Solution338 solution = new Solution338();

    @Test
    void testcase1() {
        assertEquals(0, solution.countBits(2)[0]);
        assertEquals(1, solution.countBits(2)[1]);
        assertEquals(1, solution.countBits(2)[2]);
    }

}