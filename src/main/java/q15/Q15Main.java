package q15;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q15Main {
    public static void main(String[] args) {
        ArrayList<Car> cars =new ArrayList<>();
        Car car1 = new Car("pride","sefid",1000);
        Car car2 = new Car("samand","sefid",2000);
        Car car3 = new Car("benz","sefid",40000);
        Car car4 = new Car("bmw","sefid",35000);
        Car car5 = new Car("toyota","sefid",20000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Predicate<Car> moreThan10000 = car -> car.getPrice() >10000;
        for (Car car : cars) {
          if(moreThan10000.test(car))
              System.out.println(car);
        }
    }
}
