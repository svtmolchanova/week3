package com.itacademy.molchanova.week.third.task3;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

    private Integer key;
    private String value;
    private Node left;
    private Node right;
    private Node parent;

    public Node(Integer key, String value, Node parent) {
        this.key = key;
        this.value = value;
        this.parent = parent;
    }

}
