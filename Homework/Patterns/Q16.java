/*
 
55555
4444
333
22
1
*/

public class Q16 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(5 - i + 1);
            }
            System.out.println();
        }
    }
}