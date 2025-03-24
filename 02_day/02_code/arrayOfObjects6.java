class Student{
    String name;
    int rollNo;
    float marks;
}

public class arrayOfObjects6 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "cooldude";
        s1.rollNo = 21;
        s1.marks = 6.5f;     
        
        Student s2 = new Student();
        s2.name = "noname";
        s2.rollNo = 34;
        s2.marks = 7.5f;     

        Student s3 = new Student();
        s3.name = "cluster";
        s3.rollNo = 12;
        s3.marks = 9.9f;     

        
        Student[] students = new Student[3]; // array of objects
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println("Roll No: "+student.rollNo+" Name: "+ student.name+" CGPA: "+student.marks);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name+" ");
        }
    }
}

// read 03_array_of_objects.md