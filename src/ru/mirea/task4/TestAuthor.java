package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Fedor","fedor@gmail.com",'m');
        System.out.println(author.toString());
        author.setEmail("123@gmail.com");
        System.out.println(author.toString());
    }
}
