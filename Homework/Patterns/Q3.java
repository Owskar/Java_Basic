/*
1 6 11 16 21 
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
*/

public class Q3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 25; j = j + 5) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}