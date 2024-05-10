package com.anthonyschuijlenburg.S0094;

import com.anthonyschuijlenburg.Helpers.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void inorderTraversal_testCase1() {
        Solution solutionGenerator = new Solution();

        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result = solutionGenerator.inorderTraversal(treeNode);

        assertEquals(
                new ArrayList<>(Arrays.asList(1, 3, 2)),
                result
        );
    }

    @Test
    void inorderTraversal_testCase2() {
        Solution solutionGenerator = new Solution();

        TreeNode treeNode = new TreeNode();
        List<Integer> result = solutionGenerator.inorderTraversal(treeNode);

        assertEquals(
                new ArrayList<>(List.of(0)),
                result
        );
    }

    @Test
    void inorderTraversal_testCase3() {
        Solution solutionGenerator = new Solution();

        TreeNode treeNode = new TreeNode(1);
        List<Integer> result = solutionGenerator.inorderTraversal(treeNode);

        assertEquals(
                new ArrayList<>(List.of(1)),
                result
        );
    }
}