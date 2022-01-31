package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};

        swap(array, 0, 3);
        swap(array, 1, 2);
        swap(array, 3, 4);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
