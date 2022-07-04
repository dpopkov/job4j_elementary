package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        if (word.length < post.length || post.length == 0) {
            return false;
        }
        boolean result = true;
        int lengthDiff = word.length - post.length;
        for (int j = post.length - 1; j >= 0; j--) {
            if (post[j] != word[j + lengthDiff]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
