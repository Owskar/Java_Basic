/*

6) Design a class car containing data member 
				carname,color,modelname,CC,prize
				and member function setData and showData
				(take the user input values)

*/

import javax.swing.*;

class CarModel{
	private String carname;
	private String color;
	private String modelname;
	private int CC;
	private int prize;
	
	
	public void setData(String cn,String c,String mn,int cc,int p){
		carname=cn;
		color=c;
		modelname=mn;
		CC=cc;
		prize=p;
	}
	public void showData(){
		System.out.println("car Name is "+carname);
		System.out.println("car color is "+color);
		System.out.println("car model name is "+modelname);
		System.out.println("car CC is "+CC);
		System.out.println("car prize is "+prize);
	}
	
}

class Car{
	
	public static void main(String []args){
		CarModel c1;
		c1= new CarModel();
	
	String name=JOptionPane.showInputDialog("Enter the car name ");
	String color=JOptionPane.showInputDialog("Enter the car color");
	String model=JOptionPane.showInputDialog("Enter the car model ");
	
	String cc=JOptionPane.showInputDialog("Enter the car CC");
	int c=Integer.parseInt(cc);
	
	String prize=JOptionPane.showInputDialog("Enter the car prize ");
	int p=Integer.parseInt(prize);
	
	c1.setData(name,color,model,c,p);
	c1.showData();
		
	}
}