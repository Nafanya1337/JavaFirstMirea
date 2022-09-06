package ru.mirea.task2;

public class Book {
    private String author;
    private int num_of_pages;
    private String name;

    {
        author = "No name";
        name = "Untitled";
        num_of_pages = 0;
    }

    Book(){}

    Book(int num,String... str)
    {
        num_of_pages = num;
        try
        {
            name = str[0];
            author = str[1];
        }
        catch (ArrayIndexOutOfBoundsException fail){}
    }

    public void BookInfo()
    {
        System.out.println(author + " " + name + " " + num_of_pages + " pages.");
    }
}
