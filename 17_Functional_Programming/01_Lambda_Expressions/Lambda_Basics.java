import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Lambda_Basics {
    public static void main(String[] args) {
        //cosumer function
        Consumer<String> greet = (name) -> System.out.println("Hello " + name);
        greet.accept("a");
        //to use one varivale and give one variavle
        Function<Integer,Integer> square=(a)->a*a;
        System.out.println(square.apply(5));
        //two variable to giveone variable
        BiFunction<Integer,Integer,Integer> sum=(a,b)->a+b;
        System.out.println(sum.apply(3,2));
        //to check true or false
        Predicate<Integer> even=(a)->a%2==0;
        System.out.println(even.test(8));
    }
}
