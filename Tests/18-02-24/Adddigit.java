//3) write a program to read 4 digit number and make addition of first and third digit and second and forth digit
import javax.swing.*;
class Digit{
	
	public static void main(String args[]){
		String num=JOptionPane.showInputDialog("Enter the 4 digit number");
		int n=Integer.parseInt(num);
		int temp=n;
		
		int count=1;
		int sum1=0;
		int sum2=0;
		
		while(temp!=0){
			int digit=temp%10;
			if(count%2==0){
				sum1=sum1+digit;
				count++;
			}
			else{
				sum2=sum2+digit;
				count++;
			}
			
			temp=temp/10;
			
			
		}
		System.out.println("addition of first and thrid "+sum1);
			System.out.println("addition of second  and fourth"+sum2);
	}
}