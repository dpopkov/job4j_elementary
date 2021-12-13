package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double factor = 1.0 + percent / 100.0;
        while (amount > 0) {
            amount = amount * factor - salary;
            year++;
        }
        return year;
    }
}
