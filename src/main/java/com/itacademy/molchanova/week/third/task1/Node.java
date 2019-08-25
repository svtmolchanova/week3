package com.itacademy.molchanova.week.third.task1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

    private Integer key;
    private Node left;
    private Node right;
    private Node parent;

    public Node(Integer key, Node parent) {
        this.key = key;
        this.parent = parent;
    }

}
