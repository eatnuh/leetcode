package com.eatnuih;

import com.eatnuih.Solution559.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution559Test {

    Solution559 solution = new Solution559();

    @Test
    void testcase1() {
        Node root = new Node(1, List.of());

        assertEquals(1, solution.maxDepth(root));
    }
}