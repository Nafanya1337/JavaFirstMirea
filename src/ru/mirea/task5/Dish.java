package ru.mirea.task5;

public abstract class Dish {
    String size; //поле размера будущего прибора
    String type; // тип прибора
    String color; // цвет прибора

    // инициализатор полей
    {
        size = "0x0";
        type = "Dish";
        color = null;
    }
    public String getSize() {return size;} // геттер поля размерности столового прибора
    public String getType() {return type;}  // геттер поля типа столового прибора
    public abstract void Info(); // абстрактный метод вывода на консоль информации о столовом приборе
    public String getColor() {return color;} // геттер поля цвета
}
