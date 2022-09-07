package ru.mirea.task3;


public class Human {
    private Leg leg_l;
    private Leg leg_r;

    private Hand hand_l;
    private Hand hand_r;

    public Head head;

    Human(){}
    Human(Head head,Leg[] legs,Hand[] hands)
    {
        this.head = head;
        try {
            this.leg_l = legs[0];
            this.leg_r = legs[1];
            this.hand_l = hands[0];
            this.hand_r = hands[1];
        }catch (ArrayIndexOutOfBoundsException fail){}
    }

    public void Info(){
        System.out.println(head.GetHairstyle() + " " + head.GetType() + " " + hand_r.GetLength() + " " +
                hand_l.GetLength() + " " + leg_r.GetLength() + " " + leg_l.GetLength());
    }
}

class Leg {
    private int length;
    {length = 0;}
    Leg(){}
    Leg(int length){this.length=length;}

    public int GetLength(){
        return this.length;
    }
}
class Head {
    private String hairstyle;
    private String type; // тип головы - овальная, круглая и тд.

    {
        hairstyle = "Bald";
        type = "Oval";
    }

    Head(){}
    Head(String... str)
    {
        try {
            hairstyle = str[0];
            type = str[1];
        }
        catch (ArrayIndexOutOfBoundsException fail){}
    }

    public String GetHairstyle(){
        return this.hairstyle;
    }

    public void SetHairstyle(String hairstyle){
        this.hairstyle = hairstyle;
    }

    public String GetType(){
        return this.type;
    }
}
class Hand {
    private int length;
    {length = 0;}
    Hand(){}
    Hand(int length){this.length=length;}

    public int GetLength(){
        return this.length;
    }
}
