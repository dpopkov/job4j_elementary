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
        float in = 140;
        float expected = 2;
        float euro = Converter.rubleToEuro(in);
        displayResult(in, "rubles", euro, "euros", expected);
        in = 2;
        expected = 140;
        float rubles = Converter.euroToRubles(in);
        displayResult(in, "euro", rubles, "rubles", expected);
        in = 120;
        expected = 2;
        float dollars = Converter.rubleToDollar(in);
        displayResult(in, "rubles", dollars, "dollars", expected);
        in = 2;
        expected = 120;
        rubles = Converter.dollarsToRubles(in);
        displayResult(in, "dollars", rubles, "rubles", expected);
    }

    private static void displayResult(float input, String inCurrency,
                                      float actual, String outCurrency, float expected) {
        boolean passed = expected == actual;
        System.out.println(input + " " + inCurrency + " are " + actual + " " + outCurrency
                + ". Test result : " + passed);
    }
}
