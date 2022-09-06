package ru.mirea.task2;


public class ShapeTest {
    public static void main(String[] args) {
        Shape x = new Shape();
        System.out.println(x.toString());
        Shape y = new Shape("Square");
        System.out.println(y.toString());
    }
}
