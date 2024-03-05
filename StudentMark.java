/* write a program to read student name , roll no, mark 
of 5 sub. calculate total mark and percentage and display name roll no mark of 5 sub. */
import javax.swing.*;


class StudentMark{
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
		
		
		System.out.println();
		System.out.println("Stuent Name is "+student);
		System.out.println("Stuent Roll No is "+roll);
		System.out.println("Stuent got marks in subject 1 "+s1);
		System.out.println("Stuent got marks in subject 2 "+s2);
		System.out.println("Stuent got marks in subject 3 "+s3);
		System.out.println("Stuent got marks in subject 4 "+s4);
		System.out.println("Stuent got marks in subject 5 "+s5);
		System.out.println();
		
		System.out.println("The total marks obtained is :"+total);
		System.out.println("The percentage  obtained is :"+percentage);
		
	}
} 