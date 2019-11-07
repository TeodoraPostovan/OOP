package Teodora.lab5;

public class D extends C {
    protected String d = "I am the letter D";
    public X x = new X("I am the Z letter");

    public D (){
    }

    public D (String d , X x  ) {
        super("C",x);
        this.d = d;
    }

    public String toString(){
        return super.toString() + d;
    }

}
