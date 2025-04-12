class Box {
    int length;
    int height;
    int width;

    private int weight;

    Box(int l, int w, int h, int wg) {
        this.height = h;
        this.width = w;
        this.length = l;
        this.weight = wg;
    }

    public String getWeight() {
        return ("The Weight is: "+ weight);
    }

}

class Cube extends Box {
    int l;
    int h;
    int w;
    int wg;

    Cube(int l, int w, int h, int wg) {
        super(l, w, h, wg);
        this.h = height;
        this.w = width;
        this.l = length;
        // this.wg = weight;
    }

    public void show() {
       System.out.println(super.getWeight());
    }

    public void random(){
        System.out.println("The height is: "+super.height);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Cube c = new Cube(10, 20, 30, 40);
        c.show();
        System.out.println(c.l);
        System.out.println(c.length);
        c.random();
    }
}