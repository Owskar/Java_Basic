/*
ii) 	a  b c d e
		b c d e
		c d e
		d e 
		e

*/

class Pat{
	public static void main(String args[]){
		int c=96;
		for(int i=0;i<=5;i++){
			for(int j=c;j<101;j++){
				System.out.print((char)c);
				
			}
			System.out.println();
			c++;
		}
	}
}