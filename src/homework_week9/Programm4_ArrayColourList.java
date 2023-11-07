package homework_week9;

import java.util.ArrayList;

public class Programm4_ArrayColourList {
    public static void main(String[] args) {
        // Creat a new ArrayList to store colours as Strings
        ArrayList<String> colours = new ArrayList<>();
        // Add Some colours to the Arraylist
        colours.add("Violet");
        colours.add("Indigo");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        //Print out the collection using a for-each loop
        System.out.println("Colours of Rainbow :");
        for (String colour : colours) {
            System.out.println(colours);
        }
    }
}
