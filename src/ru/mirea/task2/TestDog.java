package ru.mirea.task2;

import java.util.Vector;

public class TestDog {
    public static void AddDogs(Vector<Dog> vec,Dog... dogs)
    {
        for (var dog: dogs)
        {
            vec.add(dog);
        }
    }



    public static void main(String[] args) {
        Vector<Dog> dogs = new Vector<Dog>();
        dogs.add(new Dog("Rex",2));
        dogs.add(new Dog("Polly",1));
        System.out.println("Изначальный массив");
        dogs.forEach((x)-> System.out.print(x.ToString()+ " "));
        Dog[] array = {new Dog("Toll",6),new Dog("Lili",4), new Dog("Bob",3)};
        AddDogs(dogs,array);
        System.out.println("\nКонечный массив");
        dogs.forEach((x)-> System.out.print(x.ToString() + " "));
    }
}
