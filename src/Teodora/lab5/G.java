package Teodora.lab5;

public class G extends F {
    protected String g = "I am the letter G";

    public G (){
    }

    public G (String g , X x  ) {
        super("F",x);
        this.g = g;
    }

    public String toString(){
        return super.toString() + g;
    }
}
