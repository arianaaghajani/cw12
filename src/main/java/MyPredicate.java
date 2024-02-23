import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        Predicate<String> isEmpty = a -> a.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("salam"));

        Predicate<String> isAFirst = s -> Character.toUpperCase(s.charAt(0)) == 'A';
        System.out.println(isAFirst.test("aghajani"));
        System.out.println(isAFirst.test("jamshidi"));
    }
}

