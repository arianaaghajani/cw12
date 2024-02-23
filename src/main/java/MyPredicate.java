import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
//        Predicate<String> isEmpty = a -> a.isEmpty();
//        System.out.println(isEmpty.test(""));
//        System.out.println(isEmpty.test("salam"));
//
//        Predicate<String> isAFirst = s -> Character.toUpperCase(s.charAt(0)) == 'A';
//        System.out.println(isAFirst.test("aghajani"));
//        System.out.println(isAFirst.test("jamshidi"));
//        Predicate<LocalDate> moreThan18 = d -> (LocalDate.now().getYear() - d.getYear())>18;
//        System.out.println(moreThan18.test(LocalDate.parse("1900-11-27")));

        BiPredicate<String,Integer> numEqualStr = (a,b) -> Integer.parseInt(a) == b;
        System.out.println(numEqualStr.test("11", 10));
    }
}

