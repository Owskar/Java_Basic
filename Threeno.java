/* write a program to read a three no and print the larges no */
import javax.swing.*;
class Threeno{
	public static void main(String []arges){
		
		
		String num=JOptionPane.showInputDialog("Enter the  no.1");
		int a= Integer.parseInt(num);
		
		String num2=JOptionPane.showInputDialog("Enter the no.2");
		int b= Integer.parseInt(num2);
		
		String num3=JOptionPane.showInputDialog("Enter the no.3");
		int c= Integer.parseInt(num3);
		
		System.out.println("The Number 1 is "+a);
		System.out.println("The Number 2 is "+b);
		System.out.println("The Number 3 is "+c);
		
		if(a>b && a>c){
			System.out.println(a+"is greater");
		}
		else if(b>a && b>c){
			System.out.println(b+" is grater");
			
		}
		else{
			System.out.println(c+" is grater");
		}
	}
}