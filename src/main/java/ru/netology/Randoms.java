package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("минимальное значение не может быть больше максимального");
        }
        random = new Random();
        this.min = min;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(max - min);
            }
        };
    }
}
