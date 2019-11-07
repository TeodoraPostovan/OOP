package Teodora.lab5;

public class C extends B {
    protected String c = "I am the letter C";

    public C (){
    }

    public C (String c , X x  ) {
        super("B",x);
        this.c = c;
    }

    public String toString(){
        return super.toString() + c ;

    }
}
