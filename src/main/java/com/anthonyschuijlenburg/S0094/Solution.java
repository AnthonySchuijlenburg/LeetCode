package com.anthonyschuijlenburg.S0094;

import com.anthonyschuijlenburg.Helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<Integer> tree = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        addNodeToList(root);
        return tree;
    }

    private void addNodeToList(TreeNode root) {
        if (root == null) {
            return;
        }

        addNodeToList(root.left);
        tree.add(root.val);
        addNodeToList(root.right);
    }

}
