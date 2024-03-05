//2) write a program to check number is prime number is not
import javax.swing.*;



class Prime{
	
	public static void main(String args[]){
		
		String num=JOptionPane.showInputDialog("enter the number");
		int n=Integer.parseInt(num);
		
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println("number is not prime");
				break;
			}
			System.out.println("number is  prime");
			break;
			
		}
		
		
	}
}