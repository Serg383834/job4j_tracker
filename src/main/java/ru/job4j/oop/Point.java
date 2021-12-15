package ru.job4j.oop;

public class Point {
    private  int x;
    private  int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.y - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 2);
        System.out.println(pointA.distance(pointB));
    }
}