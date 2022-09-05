package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
class task1_1 {
    static void t1() {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        size = in.nextInt();
        int[] mas = new int[size];
        System.out.println("Начните вводить элементы массива: ");
        for (int i = 0; i < size; i++) {
            mas[i] = in.nextInt();
        }
        int sum = 0;
        System.out.println("Цикл \"for\": ");
        int i = 0;
        for (;i < size; i++) {
            sum += mas[i];
        }
        System.out.println("Сумма: " + sum);
        sum = 0;
        i = 0;
        System.out.println("Цикл \"while\": ");
        while(i<size)
        {
            sum += mas[i];
            i++;
        }
        System.out.println("Сумма: " + sum);
        sum = 0;
        i = 0;
        System.out.println("Цикл \"do while\": ");
        do {
            sum += mas[i];
            i++;
        }
        while(i<size);
        System.out.println("Сумма: " + sum);
    }

    static void t2()
    {
        System.out.print("1 ");
        for (int i=2; i<10;i++)
        {
           System.out.printf("1/%d ", i);
        }
    }

    static void t3()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int[] mas = new int[in.nextInt()];
        int temp = (100-1)+1;
        for (int i = 0;i<mas.length;i++)
        {
            mas[i] = (int)(Math.random()*temp) + 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        mas = Arrays.stream(mas).sorted().toArray();
        for (int i = 0;i<mas.length;i++) {
            System.out.print(mas[i] + " ");
        }
    }
}

public class task1 {
    public static void main(String[] args)
    {
        int solution;
        Scanner in = new Scanner(System.in);
        byte quit = 0;
        System.out.println("1-Сумма элементов массива\n2-Вывод аргументов командной строки\n" +
                "3-Вывод первых 10-ти чисел гармонического ряда\n4-Сортировка массива случайных чисел\n" +
                "5-Получение факториала числа");
        while(quit != 1) {
            System.out.println("Введите номер задания:");
            solution = in.nextInt();
            switch (solution) {
                case 1:
                    task1_1.t1();
                    break;
                case 2:
                    for (int i=0;i< args.length;i++)
                    {
                        System.out.println("Аргумент ["+i+"] : " + args[i]);
                    }
                    break;
                case 3:
                    task1_1.t2();
                    break;
                case 4:
                    task1_1.t3();
                    break;
                case 5:
                    System.out.print("Введите число: ");
                    int x = in.nextInt();
                    for (int i =1,s=1;i<=x;i++,s*=i)
                    {
                        if (i==x) System.out.print(x + "! = " + s);
                    }
                    break;
            }
            System.out.print("\nВыйти из программы?\t1-Да\t0-Нет\n");
            quit = in.nextByte();
        }
    in.close();
    }
}
