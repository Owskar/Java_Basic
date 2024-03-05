/*

write a program to read name and age and check student is eligible for 
bank exam or not age must be 22 to 30 

*/
import javax.swing.*;
class Bank{
	public static void main(String []args){
	
		String name=JOptionPane.showInputDialog("Enter the Name ");
		String age=JOptionPane.showInputDialog("Enter the age :");
		int a=Integer.parseInt(age);
		
		if(a>22 && a<=30){
			
			System.out.println(name+" You are eligible for bank exam");
		}
		else{
			
			System.out.println(name+" You are not eligible for bank exam");
		}
		
	}


} 