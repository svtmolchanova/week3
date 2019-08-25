package com.itacademy.molchanova.week.third.task4;

import com.itacademy.molchanova.week.third.task4.Node;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tree {

    private Node root;

    private Node insert(Node current, Node parent, Integer key, String value) {
        if (current == null) {
            current = new Node(key, value, parent);
        } else {
            if (key < current.getKey())
                current.setLeft(insert(current.getLeft(), current, key, value));
            else
                current.setRight(insert(current.getRight(), current, key, value));
        }
        return current;
    }

    public void insert(int key, String value) {
        root = insert(root, null, key, value);
    }

}
