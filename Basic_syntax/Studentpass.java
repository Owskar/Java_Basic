/*
write a program to read student name mark of 5 subject 
calculate total mark and percentage if student is pass
also check student  is pass with first class

*/

import javax.swing.*;
class Studentpass{
	public static void main(String []args){
	
		String Sname=JOptionPane.showInputDialog("Enter the Student Name ");
		
		String sub1=JOptionPane.showInputDialog("Enter the sub1 marks");
		int s1=Integer.parseInt(sub1);
		
		String sub2=JOptionPane.showInputDialog("Enter the sub2 marks");
		int s2=Integer.parseInt(sub2);
		
		String sub3=JOptionPane.showInputDialog("Enter the sub3 marks");
		int s3=Integer.parseInt(sub3);
		
		String sub4=JOptionPane.showInputDialog("Enter the sub4 marks");
		int s4=Integer.parseInt(sub4);
		
		String sub5=JOptionPane.showInputDialog("Enter the sub5 marks");
		int s5=Integer.parseInt(sub5);
		
		System.out.println("Student name is "+ Sname);
		
		if(s1>=40 && s2>=40 && s3>=40 && s4>=40 && s5>=40){
			int total=s1+s2+s3+s4+s5;
			double percentage=total/5;
			System.out.println(" Bhawa "+Sname+" You are pass");
			if(percentage>=60){
				
				System.out.println(" Bhawa party pahije because pass with first class");
			}
			
		}
		else{
			
			System.out.println("Bhawa sorry yaar you are fail");
		}
		
	}
}