//1) write a program to find duplicate character in a string (user input string)
import javax.swing.*;
class Q1{
	public static void main(String args[]){
		String s=JOptionPane.showInputDialog("Enter the string :");
		
		for(int i=0;i<s.length();i++){
			char ch1=s.charAt(i);
		
			for(int j=i+1;j<s.length();j++){
				char ch2=s.charAt(j);
				if(ch1==ch2){
					System.out.println("character "+ch1 + " and "+ ch2+"are equal at the indexes "+i+"and"+j);
					break;
				}
				
			}
		}
	}
}