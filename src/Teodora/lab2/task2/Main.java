package Teodora.lab2.task2;

public class Main {

    public static void main(String[] args) {
        int first;

//        Queue queue1 = new Queue();
//        queue1.setNrOfElements(4);
//        queue1.addElement(3);
//        queue1.addElement(5);
//        queue1.addElement(45);
//        queue1.addElement(6);
//        queue1.addElement(9);
//        queue1.addElement(9);
//        queue1.show();

        Queue queue2 = new Queue(6);
        queue2.addElement(9);
        queue2.addElement(6);
        queue2.show();
        queue2.deleteElement();
        queue2.show();
        queue2.addElement(6);
        queue2.addElement(20);
        queue2.show();
        queue2.addElement(15);
        queue2.show();
        first =queue2.deleteElement();
        System.out.println("The deleted element is: " + first + " List is :" + queue2.isEmpty());
        queue2.show();

    }
}