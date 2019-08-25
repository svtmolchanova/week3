package com.itacademy.molchanova.week.third.task1;

import com.itacademy.molchanova.week.third.task1.service.CountNumberNodeService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountNumberNodeServiceTest {

    private CountNumberNodeService countNumberNodeService = new CountNumberNodeService();

    @Test
    public void getCountNodesTest() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(6);
        tree.insert(3);
        tree.insert(4);
        tree.insert(8);
        tree.insert(1);
        Integer nodes = 6;

        assertEquals(nodes, countNumberNodeService.getCountNodes(tree));
    }

}
