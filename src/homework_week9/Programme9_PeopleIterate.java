package homework_week9;

import java.util.HashMap;

public class Programme9_PeopleIterate {
    public static void main(String[] args){
        // Creat a HashMap with String keys and Integer values
        HashMap<String, Integer> robots = new HashMap<>();
        // Add some key-value pairs to HashMap
        robots.put("Unimate first robot in world", 67);
        robots .put("Teletank first Military Robot", 83);
        robots.put("Tediran first Robot Drone", 50);
        robots.put("Arthrobot first Medical Robot", 40);
        robots.put("Vita first first robotic vehicle",29);
        robots.put("Asimo first humanoid", 37);
        robots.put("DaVinci first Surgical robot", 26);
        robots.put(" Universal first collaborative Robot", 18);
        robots.put("Robonaut first space robot", 16);
        // Iterate through the value using a for each loop
        for (Integer age : robots.values()) {
            System.out.println("Age:" + age);
            ;
        }

    }
}
