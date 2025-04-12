class A {
    private String ssn = "123-45-6789";

    String name = "John";

    protected int age = 25;

    public String country = "India";

    public String getSSN() {
        return ssn;
    }
}

public class Protected6 {
    public static void main(String[] args) {
        A p = new A();

       
        System.out.println("SSN (via getter): " + p.getSSN());
        System.out.println("Name (default): " + p.name); 
        System.out.println("Age (protected): " + p.age); 
        System.out.println("Country (public): " + p.country); 

    }
}
