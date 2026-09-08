public class Student {

    private String Fn;

    private String Ln;

    private int Sid;

    private double gpa;

//Encapsulation is a concept

    Student(){
        this.Fn= "no first name";
        this.Ln= "no last name";
        this.Sid= 0;
        this.gpa=0.0;
    }

//    Student(String Fn, String Ln)  {
//        this.Fn = Fn;
//        this.Ln = Ln;
//    }

    Student(String Fn, String Ln, int Sid) {
        this(Fn, Ln);
        this.Sid = Sid;
    }

    Student(String Fn, int Sid, String Ln) {
        this.Fn = Fn;
        this.Ln = Ln;
        this.Sid = Sid;
    }

    //Methods = getters and setters
    public String getFn() {
        return Fn;
    }

    public void setFn(String fn) {
        this.Fn = fn;

        this.setGpa (3.8);
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getLn() {
        return Ln;
    }

    public void setLn(String ln) {
        Ln = ln;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA value");
        }
    }
}
