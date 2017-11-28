import java.util.function.Function;

public class FunctionEx {
    public static void main(String arr[]){
        Function myFunction = (Function<Integer, Boolean>) num -> num<100;
        System.out.println(myFunction.apply(25));
    }

}
