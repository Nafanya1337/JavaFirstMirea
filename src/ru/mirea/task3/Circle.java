package ru.mirea.task3;

public class Circle {
    private int raduis;
    {raduis = 0;}
    Circle(){}
    Circle(int raduis) {this.raduis = raduis;}
    public void SetRadius(int raduis) {this.raduis = raduis;}
    public int GetRadius(){return raduis;}
}
