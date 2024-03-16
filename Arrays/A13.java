import javax.swing.*;
import java.util.*;

public class A13 {
    public static void main(String[] args) {
        // taking the size
        String size = JOptionPane.showInputDialog("Enter the size : ");
        int s = Integer.parseInt(size);

        String c[] = new String[s];

        System.out.println("Size : " + s);

        // taking the elemets in array
        for (int i = 0; i < s; i++) {
            String ele = JOptionPane.showInputDialog("Eneter the " + (i+1)+ "th element");
            c[i] = ele;

        }

        // printing the original array
        System.out.print("Original array : ");
        for (int i = 0; i < s; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // By using sort mehthod in util package

        // Arrays.sort(c);
        // System.out.print("Sorted array Using the sort mehtod : ");

        // // printing the sorted array

        // for (int i = 0; i < s; i++) {
        // System.out.print(c[i] + " ");
        // }

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i].compareTo(c[j]) > 0) {
                    String temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

     // printing the sorted array
        System.out.print("Sorted array Using the compareTo mehtod : ");
        for (int i = 0; i < s; i++) {
            System.out.print(c[i] + " ");
        }
		
		System.out.println();
		System.out.println();

    }
}