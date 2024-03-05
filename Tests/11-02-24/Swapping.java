//9) write a program to reaad two nummber and swap that two numbers without using third varable
import javax.swing.*;

class Swapping{
	
    public static void main(String args[]){
		
		

		
		String num1=JOptionPane.showInputDialog("Enter the Number 1 ");
		int n1=Integer.parseInt(num1);
		String num2=JOptionPane.showInputDialog("Enter the Number 2");
		int n2=Integer.parseInt(num2);
		
		System.out.println("Before swapping Number 1 :"+n1+"Number 2 :"+n2);
		n1=n1+n2; // 1 2
		n2=n1-n2; // 
		n1=n1-n2; // 
		
		System.out.println(" After Swapping Number 1 :"+n1+"Number 2 :"+n2);
		

	
	
	}

}