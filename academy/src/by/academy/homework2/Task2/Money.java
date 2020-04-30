package by.academy.homework2.Task2;

import java.lang.*;

public class Money {

    private Long rubles;
    private Byte kopek;
    private Long sum;

    public Money(long rubles, byte kopek) {
        super();
        this.rubles = rubles;
        this.kopek = kopek;
    }

    public long getRubles() {
        return rubles;
    }

    public void setRubles(long rubles) {
        this.rubles = rubles;
    }

    public byte getKopek() {
        return kopek;
    }

    public void setKopek(byte kopek) {
        this.kopek = kopek;
    }

    public double pack(long rubles, byte kopek) {
        sum = rubles * 100 + kopek;
        return sum;
    }

    public double unPack(long sum) {
        rubles = sum / 100;
        kopek = (byte) (sum - rubles);
        return rubles;
    }
}