package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char gender;

    {
        name = "No name";
        email = null;
        gender = '?';
    }
    Author(String name, String email, char gender)
    {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName(){return  name;}
    public String getEmail(){return email;}
    public char getGender(){return gender;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return name+" "+email+" "+gender;
    }
}
