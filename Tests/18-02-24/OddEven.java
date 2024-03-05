//4) write a program to reaad a number and print sum of all even numbers and odd numbeers separately
import javax.swing.*;
class oddeven{
	
	public static void main(String args[]){
			int even=0;
			int odd=0;
			int n;
		do{
			String num=JOptionPane.showInputDialog("Enter the number");
			n=Integer.parseInt(num);
			
		if(n%2==0){
			even=even+n;
		}else{
			odd=odd+n;
		}
			
		}while(n!=0);
		
		System.out.println("addition of even "+even);
			System.out.println("addition of odd "+odd);
	}
}