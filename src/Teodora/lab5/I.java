package Teodora.lab5;

public class I extends H {
    protected String i = "I am the letter I";

    public I (){
    }

    public I (String i , X x  ) {
        super("H",x);
        this.i = i;
    }

    public String toString(){
        return super.toString() + i;
    }
}
