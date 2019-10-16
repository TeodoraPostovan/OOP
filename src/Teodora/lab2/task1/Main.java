package Teodora.lab2.task1;


import Teodora.lab2.task1.Box;

public class Main {
    public static void main( String[] args){
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(2,3,4);

    System.out.println(box1.calculationArea(box2.height,box2.width,box2.depth));
    }
}
