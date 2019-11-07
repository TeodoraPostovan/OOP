package Teodora.lab5;

public class F extends E {
    protected String f = "I am the letter F";

    public F (){
    }

    public F (String f , X x  ) {
        super("E",x);
        this.f = f;
    }

    public String toString(){
        return super.toString() + f;
    }
}
