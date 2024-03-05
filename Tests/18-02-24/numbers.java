//9)write a progrma to read 2 numbers and print all numbers from first number to second
import javax.swing.*;

class numbers{
	public static void main(String args[]){
		
		
		String num1=JOptionPane.showInputDialog("enter the number 1");
		int n1=Integer.parseInt(num1);
		
		String num2=JOptionPane.showInputDialog("enter the number 2");
		int n2=Integer.parseInt(num2);
		if(n2>n1){
		for(int i=n1;i<=n2;i++){
			System.out.println(i);
		}
		}
		else{
			while(n1>=n2){
				
			System.out.println(n1);
			n1--;
			}
		}
		}
		}
	
