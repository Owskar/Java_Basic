/*

ii)     a b c d e
		b c d e
		c d e
		d e 
		e


*/

class Pat2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int c = 1;
			for (int j = 5; j >= i; j--) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}
}