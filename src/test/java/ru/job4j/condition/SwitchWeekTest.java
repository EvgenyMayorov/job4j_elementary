package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    public void when7ThenSunday() {
        int in = 7;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when12ThenError() {
        int in = 12;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}