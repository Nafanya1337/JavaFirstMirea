package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.GetRadius());
        circle.SetRadius(10);
        System.out.println(circle.GetRadius());
    }
}
