//9) write a program to read number and check the number is pelendrome or not 

import javax.swing.*;
class Q1{
	public static void main(String args[]){
		String num=JOptionPane.showInputDialog("Enter the number ");
		
		int n= Integer.parseInt(num);
		
		int ans=n;
		int sum=0;
		
		while(ans!=0){
			int dig=ans%10;
			sum=sum*10+dig;
			ans=ans/10;
		}
		if(n==sum){
			System.out.println("Number is palendrome");
		}
		else{
			System.out.println("Number is not palendrome");
		}
		
	}
}