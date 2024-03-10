//write a prog. to read a number and check the number is positive or negtive

import javax.swing.*;
class Homework2{
	
	public static void main(String []args){
		String num=JOptionPane.showInputDialog("Enter the number ");
		int n=Integer.parseInt(num);
		
		if(n%2==0){
			System.out.println("The Number is even");
			
		}else{
			
			System.out.println("The number is odd.");
		}
		
		  
		
	}
}