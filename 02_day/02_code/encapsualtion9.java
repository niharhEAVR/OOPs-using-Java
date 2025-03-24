class Human {
    private String childName;

    public void getChildName() { // this is called getter
        if (childName == null)
            System.out.println("Give you child a name first!");
        else
            System.out.println(childName);
    }

    public void setChildName(String name) { // this is called setter
        childName = name;
    }
}

public class encapsualtion9 {
    public static void main(String[] args) {
        Human h1 = new Human();
        // h1.childName = "mooda"; // you cannot access a private variable directly
        h1.getChildName(); // a private variable can only be asccesible through method
        h1.setChildName("cluster");
        h1.getChildName();
        
        Human h2 = new Human();
        h2.setChildName("mooda");
        h2.getChildName();
    }
}
