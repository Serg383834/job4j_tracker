package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point pointA = new Point(0, 0);
        Point pointB = new Point(2, 0);
        double out = pointA.distance(pointB);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to33then223() {
        double expected = 2.23;
        Point pointA = new Point(1, 4);
        Point pointB = new Point(3, 3);
        double out = pointA.distance(pointB);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to30then2() {
        double expected = 3.16;
        Point pointA = new Point(0, 1);
        Point pointB = new Point(3, 0);
        double out = pointA.distance(pointB);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to012then2() {
        double expected = 2.24;
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(0, 1, 2);
        double out = pointA.distance3d(pointB);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to024then4() {
        double expected = 4.47;
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(0, 2, 4);
        double out = pointA.distance3d(pointB);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when002to020Then2() {
        Point pointA = new Point(0, 0, 1);
        Point pointB = new Point(0, 2, 0);
        double expected = 2.2;
        double out = pointA.distance3d(pointB);
        Assert.assertEquals(expected, out, 0.1);
    }
}
