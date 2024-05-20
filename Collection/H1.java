import java.util.ArrayList;

public class H1 {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>();
        A.add("owskar");
        A.add("harshu");
        A.add("sonu");
        A.add("sneha");
        A.add("shruti");

        ArrayList<String> A2 = new ArrayList<String>();
        A2.add("shradda");
        A2.add("manali");
        A2.add("sanjana");
        A2.add("Kritika");

        // addAll
        A.addAll(A2);
        System.out.println("combination of both " + A);

        // remove
        A.remove("Tanvi");
        System.out.println("Tanvi remove :" + A);

        // removeAll
        A.removeAll(A2);
        System.out.println("remove A2 :" + A2);

        // clear
        A.clear();
        System.out.println("list is clear" + A);

        // isEmpty
        System.out.println("isEmpty :" + A.isEmpty());

        // size
        System.out.println("Size :" + A2.size());

    }
}