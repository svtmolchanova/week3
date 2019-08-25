package com.itacademy.molchanova.week.third.task4.service;

import com.itacademy.molchanova.week.third.task4.Node;
import com.itacademy.molchanova.week.third.task4.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WidthConcatService {

    private static String VALUE_WIDTH_CONCAT = "";

    public String valueConcatWidthService(Tree tree) {
        Node root = tree.getRoot();
        widthOrder(root);
        return VALUE_WIDTH_CONCAT;
    }

    private void widthOrder(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        do {
            if (!queue.isEmpty()) node = queue.poll();
            VALUE_WIDTH_CONCAT += node.getValue();
            if (node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
        } while (!queue.isEmpty());
    }
}
