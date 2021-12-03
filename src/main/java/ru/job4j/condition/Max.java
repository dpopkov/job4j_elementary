package ru.job4j.condition;

public class Max {
    @SuppressWarnings("ManualMinMaxCalculation")
    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
