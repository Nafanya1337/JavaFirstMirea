package ru.mirea.task2;

public class Shape {
    private String type;

    Shape() {
        type = "Undefined";
    }

    Shape(String type)
    {
        this.type = type;
    }
    public String toString() {
        return this.type;
    }
}
