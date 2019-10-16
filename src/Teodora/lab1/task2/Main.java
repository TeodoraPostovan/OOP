package Teodora.lab1.task2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Luca";
        student1.age = 20;
        student1.mark = 9.5f;

        Student student2 = new Student();
        student2.name = "Matteo";
        student2.age = 19;
        student2.mark = 8.6f;

        Student student3 = new Student();
        student3.name = "Ana";
        student3.age = 23;
        student3.mark = 6.4f;

        Student student4 = new Student();
        student4.name = "Teodora";
        student4.age = 20;
        student4.mark = 8.25f;

        Student student5 = new Student();
        student5.name = "Lavinia";
        student5.age = 19;
        student5.mark = 7.833f;

        Student student6 = new Student();
        student6.name = "Olivia";
        student6.age = student2.age;
        student6.mark = 6.27f;

        Student student7 = new Student();
        student7.name = "Vladimir";
        student7.age = student6.age;
        student7.mark = 9.403f;

        Student student8 = new Student();
        student8.name = "Marc";
        student8.age = student1.age;
        student8.mark = 7.56f;

        Student student9 = new Student();
        student9.name = "Mirabela";
        student9.age = 24;
        student9.mark = 9.89f;


        University university1 = new University();
        university1.nameU = "TUM";
        university1.FoundationYear = 1990;

        University university2 = new University();
        university2.nameU = "USM";
        university2.FoundationYear = 1880;

        University university3 = new University();
        university3.nameU = "ASEM";
        university3.FoundationYear = 1990;


        Student[] tumstudentArray = {student1, student2, student3};
        Student[] usmstudentArray = {student4, student5, student6};
        Student[] asemstudentArray = {student7, student8, student9};


        double sum1 = 0;
        double average1 = 0;
        for (int i = 0; i<3; i++){
            sum1 +=  tumstudentArray[i].mark ;
        }
        average1 = sum1/3;
        System.out.println("The TUM average is " + average1);


        double sum2 = 0;
        double average2 = 0;
        for (int i = 0; i<3; i++){
            sum2 +=  usmstudentArray[i].mark ;
        }
        average2 = sum2/3;
        System.out.println("The USM average is " + average2);


        double sum3 = 0;
        double average3 = 0;
        for (int i = 0; i<3; i++){
            sum3 +=  asemstudentArray[i].mark ;
        }
        average3 = sum3/3;
        System.out.println("The ASEM average is " + average3);

    }

}
