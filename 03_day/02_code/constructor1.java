class Car{
    String name;
    int seats;
    Car(String name, int seats){ // this is constructor
        System.out.println("Inside the constructor"); // constructor called everytime when the new object is going to created
        this.name = name;
        this.seats = seats;
    }

    void display(){
        System.out.println(this.name + " has " + this.seats +" seats.");
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Car honda = new Car("Hoinda Civic", 5);
        honda.display();
        Car skoda = new Car("Skoda gogo", 3);
        skoda.display();

        new Car("Ferrari la ferrari", 2).display();
    }
}