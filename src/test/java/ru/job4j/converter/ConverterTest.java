package ru.job4j.converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RublesThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2EurosThen140Rubles() {
        float in = 2;
        float expected = 140;
        float out = Converter.euroToRubles(in);
        float eps = 0.0001F;
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RublesThen3Dollars() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001F;
        assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert3DollarsThen180Rubles() {
        float in = 3;
        float expected = 180;
        float out = Converter.dollarsToRubles(in);
        float eps = 0.0001F;
        assertEquals(expected, out, eps);
    }
}