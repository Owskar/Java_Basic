// 5) write a program for swich case 
import javax.swing.*;

class Swichcal{
	public static void main(String []args){
		
		String Choice=JOptionPane.showInputDialog("Choose 1 for addition \n Choose 2 for subtraction \n Choose 3 Multiplication \n Choose 4 for division");
		int c=Integer.parseInt(Choice);
		
		String num=JOptionPane.showInputDialog("Enter the number 1");
		int n1=Integer.parseInt(num);
		String num2=JOptionPane.showInputDialog("Enter the number 2");
		int n2=Integer.parseInt(num2);
		int ans=0;
		System.out.println("Number 1 is :"+n1);
		System.out.println("Number 2 is :"+n2);
		
		switch(c){
			case 1:
					ans=n1+n2;
					System.out.println("Addition is "+ans);
					break;
			case 2:
					ans=n1-n2;
					System.out.println("Substraction is "+ans);
					break;
			
			case 3:
					ans=n1*n2;
					System.out.println("Multiplication is "+ans);
					break;
					
			case 4:
					ans=n1/n2;
					System.out.println("Division is  "+ans);
					break;
					
			default:
					System.out.println("wrong choice");
		}
	}
}