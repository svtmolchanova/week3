package com.itacademy.molchanova.week.third.task2;

import com.itacademy.molchanova.week.third.task2.Tree;
import com.itacademy.molchanova.week.third.task2.service.DepthTreeService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthTreeServiceTest {

    private DepthTreeService depthTreeService = new DepthTreeService();

    @Test
    public void getCountNodesTest() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(6);
        tree.insert(3);
        tree.insert(4);
        tree.insert(8);
        tree.insert(1);
        tree.insert(2);
        tree.insert(7);
        tree.insert(9);

        Integer depth = 5;

        assertEquals(depth, depthTreeService.getDeptTree(tree));
    }

}
