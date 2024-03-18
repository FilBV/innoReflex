package ru.inno.task;

public class Fraction implements Fractionable {
    private int num, denum;
    int count;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Mutator
    public void setNum(int num) {
        this.num = num;
    }

    @Mutator
    public void setDenum(int denum) {
        this.denum = denum;
    }

    @Override
    @Cache
    public double doubleValue() {
        return (double) num / denum;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", denum=" + denum +
                ", count=" + count +
                '}';
    }
}
