package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax90To28To99Then99() {
        int a = 90;
        int b = 28;
        int c = 99;
        int result = Max.max(a, b, c);
        int expected = 99;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax56To987To5To80Then987() {
        int a = 56;
        int b = 987;
        int c = 5;
        int d = 80;
        int result = Max.max(a, b, c, d);
        int expected = 987;
        assertThat(result).isEqualTo(expected);
    }
}