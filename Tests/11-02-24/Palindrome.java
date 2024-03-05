//1) write a program to check number is palendrome or not
import javax.swing.*;

class Palindorme{
	public static void main(String []args){
		String num=JOptionPane.showInputDialog("Enter the number");
		int n=Integer.parseInt(num);
		int number=n;
		int rev=0;
		while(n!=0){
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
			
		}
		if(rev==number){
			System.out.println("yes "+number+" is palendrome");
			
		}
		else{
			
			System.out.println(number+ "number is not a  palandrome");
		}
		
	}
}