/*

write a program to read two number and print the largest number

*/
import javax.swing.*;
class Largestno{
	public static void main(String []arges){
		
		
		String num=JOptionPane.showInputDialog("Enter the  no.1");
		int r= Integer.parseInt(num);
		
		String num2=JOptionPane.showInputDialog("Enter the no.2");
		int r2= Integer.parseInt(num2);
		
		if(r>r2){
			System.out.println(r+"is greater");
		}
		else if(r==r2){
			System.out.println("Both numbers are same");
			
		}
		else{
			System.out.println(r2+" is grater");
		}
	}
}