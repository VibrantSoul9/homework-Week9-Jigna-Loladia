package homework_week9;

import java.util.ArrayList;

public class Programme6_RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> chardham = new ArrayList<>();
        chardham.add("Badrinath");
        chardham.add("Kedarnath");
        chardham.add("Gangotri");
        chardham.add("Yamunotri");
        //Retrieve the element at index 1
        String chardhams = chardham.get(3);
        System.out.println("Name of chardhams 4:" + chardham);
    }

}
