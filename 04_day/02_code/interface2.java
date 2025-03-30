interface soul {
    // int age; // all the variable in interface by default is final or static
    String bone = "muscle"; // so we have to initialized it here

    void show();

    void config();
}

interface bhoot {
    void bhootShow();
}

class body implements soul, bhoot {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void bhootShow() {
        System.out.println("in bhootshow");
    }
}

public class interface2 {
    public static void main(String[] args) {
        body obj = new body();
        obj.show();
        obj.bhootShow();

        System.out.println(soul.bone); // this is how you can access interface variables, but you cant change it.
    }
}