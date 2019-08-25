package com.itacademy.molchanova.week.third.task4;

import com.itacademy.molchanova.week.third.task4.Tree;

import com.itacademy.molchanova.week.third.task4.service.WidthConcatService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WidthConcatServiceTest {

    private WidthConcatService widthConcatService = new WidthConcatService();

    @Test
    public void checkPreOrderConcatTest() {
        Tree tree = new Tree();
        tree.insert(6, "6s");
        tree.insert(7, "7s");
        tree.insert(2, "2s");
        tree.insert(4, "4s");
        tree.insert(9, "9s");
        tree.insert(1, "1s");
        tree.insert(3, "3s");
        tree.insert(5, "5s");
        tree.insert(8, "8s");

        String widthOrder = "6s2s7s1s4s9s3s5s8s";

        assertEquals(widthOrder, widthConcatService.valueConcatWidthService(tree));
    }
}
