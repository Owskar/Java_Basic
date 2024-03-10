// 7) write a program to read a number and check the number is amstrong number or not 

import javax.swing.*;
class Q4{
	public static void main(String args[]){
		String num=JOptionPane.showInputDialog("Enter the number ");
		
		int n= Integer.parseInt(num);
		int temp=n;
		int count=0;
		
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		
		
		double sum=0;
		
		int temp2=n;
			System.out.println("number is : "+temp2);
			
		while(temp2!=0){
			double digi=temp2%10;
			//System.out.println("Digit is "+digi);
			
			sum=sum+Math.pow(digi,count);
			
			temp2=temp2/10;
		}
		
		
		
		
		if(n==sum){
			System.out.println("Number is amstrong");
		}
		else{
			System.out.println("Number is not amstrong");
		}
		
		
	}
}