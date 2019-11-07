package Teodora.lab5;

public class E extends D {
    protected String e = "I am the letter E";

    public E (){
    }

    public E (String e , X x  ) {
        super("D",x);
        this.e = e;
    }

    public String toString(){
        return super.toString() + e;
    }
}
