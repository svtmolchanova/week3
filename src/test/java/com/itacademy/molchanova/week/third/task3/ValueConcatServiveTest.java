package com.itacademy.molchanova.week.third.task3;


import com.itacademy.molchanova.week.third.task3.service.ValueConcatService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValueConcatServiveTest {

    private ValueConcatService valueConcatServive = new ValueConcatService();

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

        String preOrderString = "6s2s1s4s3s5s7s9s8s";

        assertEquals(preOrderString, valueConcatServive.valueConcatPreOrderService(tree));
    }

    @Test
    public void checkInOrderConcatTest() {
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

        String inOrderString = "1s2s3s4s5s6s7s8s9s";

        assertEquals(inOrderString, valueConcatServive.valueConcatInOrderService(tree));
    }

    @Test
    public void checkPostOrderConcatTest() {
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

        String postOrderString = "1s3s5s4s2s8s9s7s6s";

        assertEquals(postOrderString, valueConcatServive.valueConcatPostOrderService(tree));
    }

}
