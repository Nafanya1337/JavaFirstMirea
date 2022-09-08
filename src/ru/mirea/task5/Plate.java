package ru.mirea.task5;

public class Plate extends Dish{
    private double depth; // собственное поле глубины тарелки

    {
        type = "Plate";
        depth = 0;
    }

    Plate(){}
    Plate(double depth,String... str)
    {
        this.depth = depth;
        try {
            size = str[0];
            type = str[1];
            color = str[2];
        }catch (ArrayIndexOutOfBoundsException fail){}
    }
    // переопределение абстрактного метода вывода информации
    @Override
    public void Info() {
        System.out.println(type + " {Size: " + size + " Color: " + color + " Depth: " + depth + " cm.}");
    }

    public double getDepth() {
        return depth;
    }
}
