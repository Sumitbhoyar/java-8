
public class MyFuncationalInterface {
    public static void main(String[] args) {
        MyInterface mi = (name1, name2) -> "Hello " + name1 + " and " + name2;
        String message = mi.sayHello("Sumit", "Viraj");
        System.out.println(message);
    }
}
interface MyInterface{
    String sayHello(String name1, String name2);
}