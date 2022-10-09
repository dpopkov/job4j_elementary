package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayDoesNotHave5ThenMinus1() {
        int[] data = {4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenElementIsInRangeThenReturnIndex() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        assertEquals(expected, FindLoop.indexInRange(data, element, start, finish));
    }

    @Test
    public void whenElementIsNotInRangeThenReturnMinusOne() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 8;
        int start = 2;
        int finish = 4;
        int expected = -1;
        assertEquals(expected, FindLoop.indexInRange(data, element, start, finish));
    }
}
