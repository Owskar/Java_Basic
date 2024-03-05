/*
E 
E D
E D C
E D C B
E D C B A
*/

public class Q14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char ch = 'E';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}