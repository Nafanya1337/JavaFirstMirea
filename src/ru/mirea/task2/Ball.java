package ru.mirea.task2;

public class Ball {
    private String color; // цвет
    private int radius; // радиус мяча
    private String firm; // фирма
    private String type; // тип мяча (футбол,воллейбол и тд)

    {
        color = "Undefined";
        firm = "Undefined";
        type = "Undefined";
        radius = 0;
    }

    Ball() {}

    Ball(int radius, String... str) {
        this.radius = radius;
        try {
            this.firm = str[0];
            this.color = str[1];
            this.type = str[2];
        } catch (ArrayIndexOutOfBoundsException fail) {}

    }

    public void BallInfo() {
        System.out.println(radius + " " + firm + " " + color + " " + type);
    }
}
