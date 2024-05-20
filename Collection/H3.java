// 3) write a program to iterate tree set and add two treeset and get first and last element from the tree set

import java.util.TreeSet;

public class H3 {
    public static void main(String[] args) {
        TreeSet<Integer> H1 = new TreeSet<Integer>();

        H1.add(11);
        H1.add(5);
        H1.add(15);
        H1.add(8);
        H1.add(20);

        TreeSet<Integer> H2 = new TreeSet<Integer>();

        H2.add(1);
        H2.add(5);
        H2.add(4);
        H2.add(48);
        H2.add(230);
        for (Integer integer : H1) {
            System.err.println("element is " + integer);
        }

        System.out.println("H1 " + H1);
        System.out.println("H2 " + H2);

        H1.addAll(H2);
        System.out.println("H" + H1);

        System.out.println("First element " + H1.first());
        System.out.println("Last element " + H1.last());

    }
}