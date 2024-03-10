/*

write a program to read student name mark of five subject
calculate total mark , percentage and print the following criteria

per>75  dist
per>65  frist
per>50  second
per>40  pass
other wise fail


*/

import javax.swing.*;
class Homework3{
	
	public static void main(String []args){
		
		String student= JOptionPane.showInputDialog("Enter the student name");
		String roll=JOptionPane.showInputDialog("Enter the roll no.");
		int r= Integer.parseInt(roll);
		
		String sub1=JOptionPane.showInputDialog("Enter the subject1 marks :");
		int s1= Integer.parseInt(sub1);
		
		String sub2=JOptionPane.showInputDialog("Enter the subject2 marks :");
		int s2= Integer.parseInt(sub2);
		
		String sub3=JOptionPane.showInputDialog("Enter the subject3 marks :");
		int s3= Integer.parseInt(sub3);
		
		String sub4=JOptionPane.showInputDialog("Enter the subject4 marks :");
		int s4= Integer.parseInt(sub4);
		
		String sub5=JOptionPane.showInputDialog("Enter the subject5 marks :");
		int s5= Integer.parseInt(sub5);
		
		int total= s1+s2+s3+s4+s5;
		
		float percentage = (total/5);
		
		if(percentage>75){

			System.out.println(student + " got the distinction");
		}
		else if(percentage>65){

			System.out.println(student + " got the First class");
		}
		else if(percentage>50){

			System.out.println(student + " got the Second class");
		}
		else if(percentage>40){

			System.out.println(student + " is pass");
		}
		else{

			System.out.println(student + " is fail");
		}
		
	}
}
