package homework_week9;

import java.util.ArrayList;

public class Programme11_ArrayList {
    public static void main(String[] args) {


        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        boolean areEqual = c1.equals(c2);
        System.out.println("Are c1 and c2 equal in terms of contents? " + areEqual);
        boolean haveSameElements = c1.containsAll(c2) && c2.containsAll(c1);
        System.out.println("Do c1 and c2 have the same elements (ignoring the order)? " + haveSameElements);
        ArrayList<String> differences = new ArrayList<>(c1);
        differences.removeAll(c2);
        System.out.println("Elements in c1 that are not in c2:" + differences);
        differences = new ArrayList<>(c2);
        differences.removeAll(c1);
        System.out.println("Elements in c2 that are not in c1 :" + differences);
        // check if both ArrayList have same size
        boolean haveSameSize = c1.size() == c2.size();
        System.out.println("Do c1 and c2 have the same size? " + haveSameSize);

    }
}
