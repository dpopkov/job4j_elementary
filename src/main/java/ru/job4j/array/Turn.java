package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        final int middle = array.length / 2;
        final int last = array.length - 1;
        for (int i = 0; i < middle; i++) {
            int temp = array[i];
            int j = last - i;
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
