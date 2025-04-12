class Student {
    int random;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("cooldude");
        System.out.println("The name of the student: "+s.getName());

        s.random = 10;
        System.out.println(s.random); // but you cant access the private variables, then you need getter and setter method
    }

}
