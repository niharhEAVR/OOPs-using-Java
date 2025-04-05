public class Static6 {

    class Text {
        String text;
        Text(String text){
            this.text = text;
        }
    }


    static class Text2 {
        String text;
        Text2(String text){
            this.text = text;
        }
    }

    public static void main(String[] args) {
        // Text t1 = new Text("Hello");  // you cannot access it, you need a static keyword for that
         
        Text2 t2 = new Text2("Hello");
        Text2 t3 = new Text2("Astala");

        System.out.println(t2.text);
        System.out.println(t3.text);
    }
}
