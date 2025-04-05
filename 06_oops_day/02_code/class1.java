class Student {
    int rollNo;
    String name;
    float marks;

    Student() {
    }

    Student(int rno, String name, float marks) {
        this.rollNo = rno;
        this.marks = marks;
        this.name = name;
    }

    Student(Student s){
        this.rollNo = s.rollNo;
        this.marks = s.marks;
        this.name = s.name;
    }

    void greeting() {
        System.out.println("Hello " + this.name);
    }
}

public class class1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.print("By default: ");
        System.err.println(s1.marks + " " + s1.name + " " + s1.rollNo);
        s1.rollNo = 10;
        s1.name = "Suresh";
        s1.marks = 67.9f;
        System.out.print("After initialization: ");
        System.err.println(s1.marks + " " + s1.name + " " + s1.rollNo);

        Student s2 = new Student(30, "noname", 87.5f);
        System.err.println(s2.marks + " " + s2.name + " " + s2.rollNo);
        s2.greeting();

        Student s3 = new Student(s1);
        s3.greeting();

    }

}