package com.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FactorialTest {

    @Test
    public void test() {
        assertEquals(120, Factorial.usingRecursion(5));
        assertEquals(120, Factorial.usingIteration(5));
        assertEquals(120, Factorial.tailRecursive(5));

        assertEquals(1, Factorial.usingRecursion(0));
        assertEquals(1, Factorial.usingIteration(0));
        assertEquals(1, Factorial.tailRecursive(0));

        assertEquals(1, Factorial.usingRecursion(1));
        assertEquals(1, Factorial.usingIteration(1));
        assertEquals(1, Factorial.tailRecursive(1));

        try {
            Factorial.usingRecursion(-1);
        } catch (Throwable t) {
            assertTrue(t instanceof IllegalArgumentException);
        }

        try {
            Factorial.usingIteration(-1);
        } catch (Throwable t) {
            assertTrue(t instanceof IllegalArgumentException);
        }

        try {
            Factorial.tailRecursive(-1);
        } catch (Throwable t) {
            assertTrue(t instanceof IllegalArgumentException);
        }
    }
}
