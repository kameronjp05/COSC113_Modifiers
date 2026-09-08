//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//public means accessible from anywhere
//private means accessible from inside the class

    public static void main(String[] args) {

        Student s8, s9, s10;
        s8 = new Student();
        //s8.gpa = 4.0;
        s8.setFn("Praise");
        s8.setLn("Ben");
        //s8.gpa=-3.1;
//        s8.setGpa(3.8);

        System.out.println("Praise Ben gpa is:" + s8.getGPA());

        //code from sept 3 class
        Student s6 = new Student();
//        s6.Fn = "Melanie";
//        s6.setLn("Thomas");
//        s6.Ln = "Simpson";

//        Student s4 = new Student("Helena", "Payton" );
//        System.out.println(s4.Fn);
//        System.out.println(s4.Ln);
//        System.out.println(s4.Sid);


        Student s1;
//        s1 = new Student();
//        System.out.println(s1);
//        System.out.println(s1.Fn);

        Student s2;
        s2 = new Student("tobiloba", "Ayodeji", 14141);
        System.out.println(s2.Fn);
        System.out.println(s2.Ln);

        Student s3;
        String Fn = "Miguel";
        String Ln = "Gascaortega";
        int Sid = 31415;
        s3 = new Student(Fn, Ln, Sid);
//        System.out.println(s3.Fn);
//        System.out.println(s3.Ln);

        Student s5;
        s5 = new Student(Fn, Sid, Ln);



    }
}