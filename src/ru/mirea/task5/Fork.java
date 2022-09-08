package ru.mirea.task5;

public class Fork extends Dish {
    String material; // собственное поле для класса вилки - материал
    double length; // собственное поле - длина вилки

    {
        type = "Fork"; // по умолчанию вилка - десертная или обычная по усмотрению пользователя.
        material = null; // материал неизвестен
        length = 0;
    }
    Fork(){}
    Fork(double length, String... str)
    {
        this.length = length;
        try {
            material = str[0];
            type = str[1];
            color = str[2];
        }catch (ArrayIndexOutOfBoundsException fail){}
    }

    // переопределение абстрактного метода вывода информации
    @Override
    public void Info() {
        System.out.println(type + " {Material: " + material + " Color: " + color + " Length: " + length + " cm.}");
    }

    // геттер собственного поля - материал
    public String getMaterial() {
        return material;
    }

    public double getLength() {
        return length;
    }
}
