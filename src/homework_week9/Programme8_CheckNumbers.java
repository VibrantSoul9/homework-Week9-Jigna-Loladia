package homework_week9;

import java.util.HashSet;

public class Programme8_CheckNumbers {
    public static void main(String[] args) {
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(4);
        numbersSet.add(7);
        numbersSet.add(8);
        for (int number = 1; number <= 10; number++) {
            if (numbersSet.contains(number)) {
                System.out.println(number + " is in the set.");
            } else {
                System.out.println(number + " is not in the set.");
            }
        }
    }
}