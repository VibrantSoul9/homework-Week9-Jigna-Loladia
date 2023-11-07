package homework_week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5_Iterator {
    public static void main(String[] args) {
        // creat a new ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("I love Mango the most");
        list.add("I like banana 2st most");
        list.add("I like oranges 3rd");
        list.add("I like apple 4th");
        // Creat an Iterator for the ArrayList
        Iterator<String> iterator = list.iterator();
        // use the Iterator to iterate through the elements
        System.out.println("Iterating through the ArrayList using Iterator:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
