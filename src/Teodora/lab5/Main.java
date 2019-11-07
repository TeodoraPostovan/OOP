package Teodora.lab5;

public class Main {
    public static void main(String[] args) {

        X My_x = new X("X");
        A My_a = new A("A",My_x);
        System.out.println(My_a.toString());
        B My_b = new B("B ",My_x);
        System.out.println(My_b.toString());
        C My_c = new C("C ",My_x);
        System.out.println(My_c.toString());
        D My_d = new D("D ",My_x);
        System.out.println(My_d.toString());
        E My_e = new E("E ",My_x);
        System.out.println(My_e.toString());
        F My_f = new F("F ",My_x);
        System.out.println(My_f.toString());
        G My_g = new G("G ",My_x);
        System.out.println(My_g.toString());
        H My_h = new H("H ",My_x);
        System.out.println(My_h.toString());
        I My_i = new I("I ",My_x);
        System.out.println(My_i.toString());
        J My_j = new J("J ",My_x);
        System.out.println(My_j.toString());
    }
}
