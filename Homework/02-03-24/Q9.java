import javax.swing.JOptionPane;

/*
 1   2   3   4   5   6   7   8   9   
2   4   6   8   10   12   14   16   18   
3   6   9   12   15   18   21   24   27   
4   8   12   16   20   24   28   32   36   
5   10   15   20   25   30   35   40   45   
6   12   18   24   30   36   42   48   54   
7   14   21   28   35   42   49   56   63   
8   16   24   32   40   48   56   64   72   
9   18   27   36   45   54   63   72   81   
10   20   30   40   50   60   70   80   90 
 
 */
public class Q9 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter the number ");
        int n = Integer.parseInt(num);
        for (int i = 1; i <= 10; i++) {

            int count = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(count + "   ");
                count = count + i;
            }

            System.out.println();

        }
    }
}