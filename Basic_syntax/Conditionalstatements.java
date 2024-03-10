// If else
import javax.swing.*;	
class Conditionalstatements{
	public static void main(String []args){

		String name=JOptionPane.showInputDialog("Enter the Name ");
		String age=JOptionPane.showInputDialog("Enter the age :");
		int a=Integer.parseInt(age);
		
		if(a>=18){
			System.out.println(name+ " You are eligible for voting");
			
		}	
		else{
			System.out.println(name+" You are not eligible for voting");
		}
	}
	

} 