package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when31to63then3Dot6() {
        double expected = 3.6;
        Point a = new Point(3, 1);
        Point b = new Point(6, 3);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when40to27then7Dot28() {
        double expected = 7.28;
        Point a = new Point(4, 0);
        Point b = new Point(2, 7);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}