import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.*;

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

//        BiPredicate<String,Integer> numEqualStr = (a,b) -> Integer.parseInt(a) == b;
//        System.out.println(numEqualStr.test("11", 10));

//        BiPredicate<Integer,Integer> ageCompare = (age1, age2) -> age1 > age2;
//        System.out.println(ageCompare.test(22, 18));

//        System.out.println(new BiPredicate<Integer, Integer>() {
//
//            @Override
//            public boolean test(Integer age1, Integer age2) {
//                return age1 > age2;
//            }
//        }.test(20, 25));

//         Comparator<Integer> integerComparator = Integer::compareTo;
//        System.out.println(integerComparator.compare(20, 22));
        //10
//        Supplier<LocalDate> date = () -> LocalDate.now();
//        System.out.println(date.get());

//        int num = 5;
//        char ascii = (char) (num + '0');
//        System.out.println("ASCII code of " + num + " is: " + (int) ascii);
//
//        Function<Integer,Integer> getAscii = n -> (int) ((char)(n + '0'));
//        System.out.println(getAscii.apply(5));

//        Function<Integer,Integer> getNumber = n -> n -48;
//        System.out.println(getNumber.apply(53));

//        BiFunction<String,String,String> person = (a,b) -> a+ " "+ b;
//        System.out.println(person.apply("ariana", "aghajani"));


    }
}

