package com.itacademy.molchanova.week.third.task2.service;

import com.itacademy.molchanova.week.third.task2.Node;
import com.itacademy.molchanova.week.third.task2.Tree;

public class DepthTreeService {

    public static int depthLeft = 0;
    public static int depthRight = 0;

    public Integer getDeptTree(Tree tree) {
        Node root = tree.getRoot();
        checkDepthNode(root);
        Integer depth = Math.max(depthLeft, depthRight);
        return depth;
    }

    public void checkDepthNode(Node node) {
        if (node == null) {
            return;
        }
        if (node.getLeft() != null) {
            depthLeft++;
            checkDepthNode(node.getLeft());
        }
        if (node.getRight() != null) {
            depthRight++;
            checkDepthNode(node.getRight());
        }
    }

}
