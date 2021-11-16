package ru.job4j.converter;

public class Converter {

    public static final int RUBLES_PER_EURO = 70;
    public static final int RUBLES_PER_DOLLAR = 60;

    public static float rubleToEuro(float value) {
        return value / RUBLES_PER_EURO;
    }

    public static float euroToRubles(float value) {
        return value * RUBLES_PER_EURO;
    }

    public static float rubleToDollar(float value) {
        return value / RUBLES_PER_DOLLAR;
    }

    public static float dollarsToRubles(float value) {
        return value * RUBLES_PER_DOLLAR;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        float rubles = Converter.euroToRubles(2);
        System.out.println("2 euro are " + rubles + " rubles");
        float dollars = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollars + " dollars");
        rubles = Converter.dollarsToRubles(2);
        System.out.println("2 dollars are " + rubles + " rubles");
    }
}
