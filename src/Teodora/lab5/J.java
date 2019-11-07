package Teodora.lab5;

public class J extends I {
    protected String j = "I am the letter J";

    public J (){
    }

    public J (String j , X x  ) {
        super("I",x);
        this.j = j;
    }

    public String toString(){
        return super.toString() + j;
    }
}
