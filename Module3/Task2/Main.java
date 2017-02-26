package alexey_efimenko.Module3.Task2;

/**
 * Created by Linkin on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Adder adder=new Adder();
        Arithmetic arithmetic=new Arithmetic();
        System.out.println(arithmetic.add(50,30));
        System.out.println(adder.check(70,40));
    }
}
