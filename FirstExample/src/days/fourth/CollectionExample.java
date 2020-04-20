package days.fourth;

import java.util.*;

/**
 * @author Simona Lukoseviciute
 */
public class CollectionExample {

    public static void main(String[] args) {
        mapExample();
        //setExample();
        //listExample();

        User user = new User("Simona", "Lukoseviciute");
        System.out.println((user.getName() + " " + user.getSurname()));
    }

    private static void mapExample(){

        Map<Integer, String> cars = new HashMap<>();

        cars.put(1999, "audi");
        cars.put(2000, "bmw");

        cars.keySet().forEach(k -> System.out.println("key " + k + " value " + cars.get(k)));
        System.out.println(cars.size());
        System.out.println(cars.containsValue("bmw"));
    }
    private static void setExample(){

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);

        numbers.forEach(System.out::println);
    }
    private static void listExample() {

        List<String> names =  new ArrayList<>();

        names.add("Simona");
        names.add("Aiste");
        names.add("Giedre");
        names.add("Mante");

        System.out.println(names.size());
        System.out.println(names.get(2));
        names.forEach(System.out::println);
        System.out.println(names.contains("Simona"));
    }
}
