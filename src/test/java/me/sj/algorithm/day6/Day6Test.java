package me.sj.algorithm.day6;

import org.junit.jupiter.api.Test;

public class Day6Test {
    Day6 day = new Day6();
    @Test
    public void clothingStoreTest() {
        day.clothingStore(580000);
    }

    @Test
    public void iceAmericanoTest() {
        day.iceAmericano(15000);
    }

    @Test
    public void getAgeTest() {
        day.getAge(2022);
    }
}
