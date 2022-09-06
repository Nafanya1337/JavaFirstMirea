package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    {
        name = null;
        age = 0;
    }
    Dog(){}

    Dog(String name) {this.name = name;}

    Dog(int age) {this.age = age;}
    Dog(String name, int age)
    {
        this(name);
        this.age = age;
    }

    // геттеры
    public String GetName() {return name;}
    public int GetAge() {return age;}

    // сеттеры
    public void SetName(String name) {this.name = name;}
    public void SetAge(int age) {this.age = age;}

    // перевод из собачьих лет в людские
    public int ConvertAge() {return age*7;}

    public String ToString() {return (name + " " + age);}
}
