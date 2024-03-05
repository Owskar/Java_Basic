/*
 1 3 5 7 9 
3 5 7 9 11
5 7 9 11 13
7 9 11 13 15
9 11 13 15 17
*/

public class Q6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i += 2) {
            int count = i;
            for (int j = 1; j <= 5; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            count++;
            System.out.println();
        }
    }
}