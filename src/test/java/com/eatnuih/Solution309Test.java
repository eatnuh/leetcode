package com.eatnuih;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution309Test {

    Solution309 solution = new Solution309();

    @Test
    void testcase1() {
        assertEquals(3, solution.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    @Test
    void testcase2() {
        assertEquals(3, solution.maxProfit(new int[]{1, 2, 4}));
    }

}