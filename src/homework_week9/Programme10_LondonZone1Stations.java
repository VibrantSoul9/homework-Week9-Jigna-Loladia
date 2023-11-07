package homework_week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme10_LondonZone1Stations {
    public static void main(String[] args) {
        // Creat a HashMap to map station names to the lines that pass through them
        Map<String, String> stationToLineMap = new HashMap<>();
        stationToLineMap.put("KingsCross StPancras", "Circle,Hammersmith & city, Metropolitan, Northen, Piccadilly, Victora");
        stationToLineMap.put("Waterloo", "Bakerloo, Jubilee, Northen, Waterloo & City");
        stationToLineMap.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationToLineMap.put("Westminster", "Circle, District, Jubilee");
        stationToLineMap.put("Blackfriars", "Circle, District, Thamslink");
        stationToLineMap.put("Angel", " Northen");
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter a station name
        System.out.println("Enter a station name (e.g. KingsCross StPancras, Waterloo, OxfordCircus) : ");
        String stationName = scanner.nextLine();
        // look up the lines that pass through the entered station
        String lines = stationToLineMap.get(stationName);
        // Display the result
        if (lines != null) {
            System.out.println("Lines that pass through" + stationName + ": " + lines);
        } else {
            System.out.println("Station not found or its not in Zone 1");
        }
        // close the scanner
        scanner.close();
    }
}
