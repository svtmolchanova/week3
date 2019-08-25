package com.itacademy.molchanova.week.third.task1.service;

import com.itacademy.molchanova.week.third.task1.Node;
import com.itacademy.molchanova.week.third.task1.Tree;


import java.util.Stack;

public class CountNumberNodeService {

    private static Integer COUNT = 0;

    public Integer getCountNodes(Tree tree) {
        Node node = tree.getRoot();
        preOrder(node);
        return COUNT;
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        COUNT++;
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
}
