import java.util.function.Consumer;

public class ProducerEx {
    public static void main(String arr[]){
        Consumer myFunction = (Consumer<Integer>) consume -> System.out.println("Number = " + consume);
        myFunction.accept(123);
    }

}
