package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertFalse(result);
    }

    @Test
    public void whenWordIsShorterThenFalse() {
        char[] word = {'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertFalse(result);
    }
}
