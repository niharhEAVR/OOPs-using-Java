class Student {
    String name;
    int rollNo;
    int age;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.print("Name: " + this.name);
        System.out.println(" Roll No: " + this.rollNo);
    }

    void setAge(int age){ 
        this.age = age; // here if you see the parameter age is same as class age, thats why we need this keyword
    }

}

public class this10 {
    public static void main(String[] args) {
        Student s1 = new Student("cooldude", 101);
        s1.display();
        s1.name = "mooda";
        s1.display();
        Student s2 = new Student("cluster", 102);
        s2.display();
        s2.setAge(12);
        System.out.println(s2.age);
    }
}
