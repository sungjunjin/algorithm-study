package me.sj.algorithm.day3;

import org.junit.jupiter.api.Test;

public class Day3Test {
    @Test
    public void remainIntegerTest() {
        Day3 day3 = new Day3();
        int result = day3.remainInteger(3, 2);
    }

    @Test
    public void fractionsTest() {
        Day3 day3 = new Day3();
        int[] result = day3.fractions(1, 2,3,4);
    }
}
