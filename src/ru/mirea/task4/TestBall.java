package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setX(0);
        System.out.println(ball.toString());
        ball.setY(1);
        System.out.println(ball.toString());
        ball.move(10.4,3.87);
        System.out.println(ball.toString());
    }
}
