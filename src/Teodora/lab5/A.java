package Teodora.lab5;

public class A {
    protected String a = " I am the letter A";
    public X x = new X ("E am the W letter");

    public A (){
    }

    public  A ( String a, X x) {

        this.a = a;
        this.x = x;
    }

    public String toString(){
        return a + x.getX() ;

    }
}



