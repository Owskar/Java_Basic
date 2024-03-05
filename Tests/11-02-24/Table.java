//2) write a program to read a number and print table of that number 
import javax.swing.*;

class Table{
	public static void main(String []args){
		String num=JOptionPane.showInputDialog("Enter the number");
		int n=Integer.parseInt(num);
	
	for(int i=1;i<=10;i++){
		System.out.println(n+"X"+i+"="+n*i);
	}
	}
}