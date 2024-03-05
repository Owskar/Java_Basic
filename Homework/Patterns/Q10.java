/*
time 
1 
3 2
6 5 4
10 9 8 7
15 14 13 12 11
*/

public class Q10 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            int count = num + i - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;

            }
            System.out.println();
            num = num + i;
        }
    }
}