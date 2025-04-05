class people {
    int age;
    String name;
    int bodyCount;

    people() {
        // this is how you can call constructor from another constructior
        this(13,"cooldude", 39);
    }

    people(int age, String name, int bodyCount) {
        this.age = age;
        this.bodyCount = bodyCount;
        this.name = name;
    }

    void greeting() {
        System.out.println("Hello " + this.name);
    }
}

public class Class2 {
    public static void main(String[] args) {
        people s1 = new people();

        System.err.println(s1.age + " " + s1.name + " " + s1.bodyCount);
        s1.greeting();
    }

}