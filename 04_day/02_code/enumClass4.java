enum laptop{
    macbook(100_000), victus(67_000), nitro(77_000), rog(173_000);

    private int price;
    private laptop(int price){
        this.price = price;
    }

    void getPrice(){
        System.out.println(price);
    }

    void setPrice(int price){
        this.price = price;
    }
}

public class enumClass4 {
    public static void main(String[] args) {
       laptop lappy = laptop.victus;
       lappy.setPrice(67_000+1000);
       lappy.getPrice();
    }
}