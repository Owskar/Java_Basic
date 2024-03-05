//
//8)writea a progrma to read 3 numbers and print largest

import javax.swing.*;

class largest{
	public static void main(String args[]){
		
		
		String num1=JOptionPane.showInputDialog("enter the number 1");
		int n1=Integer.parseInt(num1);
		
		String num2=JOptionPane.showInputDialog("enter the number 2");
		int n2=Integer.parseInt(num2);
		
		String num3=JOptionPane.showInputDialog("enter the number 3");
		int n3=Integer.parseInt(num3);
		
		if(n1>n2 && n1>n3){
			System.out.println(n1+" is greater");
		}
		else if(n2>n1 && n2>n3){
			System.out.println(n2+" is greater");
		}
		else if(n3>n1 && n3>n2){
			System.out.println(n3+" is greater");
		}
		else{
			System.out.println("all are same");
		}
	}
}