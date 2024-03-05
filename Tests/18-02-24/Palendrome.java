
//2) write a program to check number is prime number is not
import javax.swing.*;

class Prime {

	public static void main(String args[]){
		
		String num=JOptionpane.showInputDialog("enter the number");
		int n=Integer.parseInt(num);
		int check=1;
		for(int i=1;i<n;i++){
			if(n%i==0){
				check=0;
			}
			
		}
		if(check){
				System.out.println("number is not prime");
		}
		else{
				System.out.println("number is prime")
		}
		
	}
}