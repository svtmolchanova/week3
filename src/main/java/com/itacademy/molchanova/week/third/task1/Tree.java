package com.itacademy.molchanova.week.third.task1;

import com.itacademy.molchanova.week.third.task1.Node;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tree {

    private Node root;

    private Node insert(Node current, Node parent, Integer key) {
        if (current == null) {
            current = new Node(key, parent);
        } else {
            if (key < current.getKey())
                current.setLeft(insert(current.getLeft(), current, key));
            else
                current.setRight(insert(current.getRight(), current, key));
        }
        return current;
    }

    public void insert(int key) {
        root = insert(root, null, key);
    }

}
