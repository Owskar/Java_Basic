/*
A B C D E 
F G H I J
K L M N O
P Q R S T
U V W X Y
*/

public class Q9 {
    public static void main(String[] args) {
        int a = 65;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) a + " ");
                a++;
            }
            System.out.println();
        }
    }
}