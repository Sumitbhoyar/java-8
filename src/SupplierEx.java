import java.util.Random;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier myFunction = ()  -> new Random().nextInt();
        System.out.println(myFunction.get());
    }
}
