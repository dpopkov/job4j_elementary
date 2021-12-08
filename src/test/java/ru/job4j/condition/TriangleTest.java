package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExists() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exists(ab, ac, bc);
        assertTrue(result);
    }

    @Test
    public void whenDoesNotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean result = Triangle.exists(ab, ac, bc);
        assertFalse(result);
    }
}
