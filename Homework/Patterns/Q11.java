/*
1 
3 5
7 9 11
13 15 17 19
21 23 25 27 29

*/

public class Q11 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }
    }
}