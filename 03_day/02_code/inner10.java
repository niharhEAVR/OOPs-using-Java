class boob {
    class tits {
        void show() {
            System.out.println("in tits show");
        }
    }

    static class mouth{
       void show2(){
            System.out.println("In mouth");
        }
    }
}

public class inner10 {
    public static void main(String[] args) {
        boob bob = new boob();

        boob.tits tit = bob.new tits(); // This is how you can call a inner class, or access it
        
        boob.mouth m = new boob.mouth();

        tit.show();
        m.show2();
    }
}
