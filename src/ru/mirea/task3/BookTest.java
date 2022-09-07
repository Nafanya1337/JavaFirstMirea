package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(3,new String[]{"А.П. Чехов","Пересолил","16.11.1885"});
        book1.BookInfo();
        Book book2 = new Book();
        book2.SetNum(15);
        book2.SetAuthor("А.С. Пушкин");
        book2.SetDate("1836");
        book2.SetTitle("Капитанская дочка");
        book2.BookInfo();
    }
}
