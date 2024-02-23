package q14;

public class Q14Main {
    public static void main(String[] args) {
//        Factory person = (a,b) -> new Person(a,b);
        Factory person = Person::new;
        Person person1 = person.create("ariana", "aghajani");
        System.out.println(person1);
    }
}
