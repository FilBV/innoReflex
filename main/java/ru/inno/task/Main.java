package ru.inno.task;


public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(2, 4);
        Fractionable num = Utils.cache(fr);
        num.doubleValue();
        num.doubleValue();
        num.doubleValue();
        num.setDenum(5);
        num.doubleValue();

    }
}