package homework_week9;

import java.util.ArrayList;

public class Programme7_EmptyArray {
    public static void main(String[] args) {
        ArrayList<String> satisfaction = new ArrayList<>();
        // Check if array list is empty
        if (satisfaction.isEmpty()) {
            System.out.println("Humans never get satisfied.");
        } else {
            System.out.println("Dissatisfaction is the origin of many inventions");
        }
    }
}
