//
//3) writea a program to read year and check year is leap or not
import javax.swing.*;

class Isleap{
	public static void main(String []args){
		String year=JOptionPane.showInputDialog("Enter the number");
		int y=Integer.parseInt(year);
		if(y%4==0 && y%400!=0 && y%100!=0){
			System.out.println("Year is a leap year");
		}
		else{
			System.out.println("Year is not a leap year");
			
		}
		
	}
}