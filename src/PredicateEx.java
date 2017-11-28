import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate myFunction = (Predicate<Integer>) num -> num <100;
        System.out.println(myFunction.test(50));
    }
}
