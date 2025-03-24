class Mobile{
    String brand;
    String name;
    static String network; // this is static variable
    int price;
    static float display;

    // we can use static variable in static method, but we cannot use normal variables in static method
    public static void show(){ // this is static method
        System.out.println("Astala Vista "+network+" networks");
    }

    static{ // this is static block and it used to initialize static variables
        display = 6.5f;
    }
}

public class static8 {
    public static void main(String[] args) {
        Mobile.network = "5g"; // all mobiles should have 5g network
        Mobile.show();
        System.out.println("All mobile phones display size is: "+Mobile.display);

        Mobile phone = new Mobile();
        phone.brand = "Lava";
        phone.name = "Lava Yuva 2";
        phone.price = 19_999;
        System.out.println(phone.name+" has "+phone.network+" network");
        
        Mobile phone2 = new Mobile();
        phone2.brand = "Samsung";
        phone2.name = "Samsung galaxy z2";
        phone2.price = 29_999;
        
        
        System.out.println(phone2.name+" has "+phone2.network+" network");
    }
}