package com.eatnuih;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution310Test {
    Solution310 solution = new Solution310();

    @Test
    void testcase1() {
        List<Integer> expected = List.of(1);
        List<Integer> actual = solution.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}});

        assertEquals(expected, actual);
    }

    @Test
    void testcase2() {
        List<Integer> expected = List.of(0);
        List<Integer> actual = solution.findMinHeightTrees(1, new int[][]{});
        assertEquals(expected, actual);
    }

}