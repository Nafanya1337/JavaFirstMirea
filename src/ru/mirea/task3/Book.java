package ru.mirea.task3;

public class Book {
    private String author;
    private int num_of_pages;
    private String title;

    private String date;

    {
        author = "No name";
        title = "Untitled";
        date = "00.00.0000";
        num_of_pages = 0;
    }

    Book(){}

    Book(int num,String... str)
    {
        num_of_pages = num;
        try
        {
            author = str[0];
            title = str[1];
            date = str[2];
        }
        catch (ArrayIndexOutOfBoundsException fail){}
    }

    public void BookInfo()
    {
        System.out.println(author + " - \"" + title + "\" (" + num_of_pages + " pages, date: " + date + ")");
    }

    public void SetNum(int num_of_pages)
    {
        this.num_of_pages = num_of_pages;
    }

    public int GetNum(){return num_of_pages;}

    public void SetAuthor(String author)
    {
        this.author = author;
    }

    public String GetAuthor(){return author;}

    public void SetTitle(String title)
    {
        this.title = title;
    }

    public String GetTitle(){return title;}

    public void SetDate(String date)
    {
        this.date = date;
    }

    public String GetDate(){return date;}

}
