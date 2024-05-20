// write a program to compare 2 hash set class

import java.util.HashSet;

public class H2 {
    public static void main(String[] args) {
        HashSet<String> H1 = new HashSet<String>();
        H1.add("Shraddha");
        H1.add("Pratiksha");
        H1.add("Kritika");
        H1.add("Sakshi");

        HashSet<String> H2 = new HashSet<String>();
        H2.add("Shraddha");
        H2.add("Pratiksha");
        H2.add("Kritika");
        H2.add("Sakshi");

        System.out.println(H1 == H2);
        System.out.println(H1.equals(H2));
        // System.out.println(H1.compare(H2));

    }
}