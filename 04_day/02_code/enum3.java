enum status{
    Running, Failed, Pending, Success;
//      0,      1,      2,      3           -- these are indexes of enum constants
}

public class enum3 {
    public static void main(String[] args) {
       status state = status.Failed;

       System.out.println("status is: "+state);
       System.out.println(state.ordinal()); // here you can see the index value


       status[] stateArr = status.values();
       System.out.print("status are: ");
       for (int i = 0; i < stateArr.length; i++) {
        System.out.print(stateArr[i]+ " ");
       }
    }
}