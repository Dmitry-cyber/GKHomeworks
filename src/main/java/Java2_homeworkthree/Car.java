package Java2_homeworkthree;

import java.util.*;


public class Car {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Mercedes", "BMW", "Audi", "Toyota", "Vokswagen", "Opel", "Subaru", "Range Rover", "Toyota", "Vokswagen", "BMW", "Audi", "Toyota", "Subaru", "Subaru", "Audi", "Toyota", "Subaru", "Subaru", "Toyota");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Автомобиль");
        System.out.println(words.toString());
        System.out.println("Какие марки автомобилей");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости марок");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }

}
