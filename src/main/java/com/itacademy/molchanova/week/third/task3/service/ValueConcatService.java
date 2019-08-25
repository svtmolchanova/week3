package com.itacademy.molchanova.week.third.task3.service;

import com.itacademy.molchanova.week.third.task3.Node;
import com.itacademy.molchanova.week.third.task3.Tree;

public class ValueConcatService {

    private static String VALUE_PRE_ORDER = "";
    private static String VALUE_IN_ORDER = "";
    private static String VALUE_POST_ORDER = "";

    public String valueConcatPreOrderService(Tree tree) {
        Node root = tree.getRoot();
        preOrder(root);
        return VALUE_PRE_ORDER;
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        VALUE_PRE_ORDER += node.getValue();
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public String valueConcatInOrderService(Tree tree) {
        Node root = tree.getRoot();
        inOrder(root);
        return VALUE_IN_ORDER;
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        VALUE_IN_ORDER += node.getValue();
        inOrder(node.getRight());
    }

    public String valueConcatPostOrderService(Tree tree) {
        Node root = tree.getRoot();
        postOrder(root);
        return VALUE_POST_ORDER;
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        VALUE_POST_ORDER += node.getValue();
    }
}
