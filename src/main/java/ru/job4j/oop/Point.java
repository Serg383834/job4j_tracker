package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private  int x;
    private  int y;
    private  int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2) + pow((this.z - that.z), 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 2);
        Point pointC = new Point(0, 0, 0);
        Point pointD = new Point(0, 2, 4);

        System.out.println(pointA.distance(pointB));
        System.out.println(pointC.distance3d(pointD));
    }
}