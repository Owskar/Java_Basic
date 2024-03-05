/*
5) person DM- name
		      city
		  MF- setdata()
		      showData()
			  
	emp extends parson
		dm -wages 
		    wdays
		mf- setdata()
		    showdata()
			paymet()
			
*/

import javax.swing.*;

class person {
	private String name;
	private String city;

	public void setData() {
		name = JOptionPane("Enter the name ");
		city = JOptionPane("Enter the name ");

	}

	public void showData() {
		Systsem.out.println("name is " + name);
		Systsem.out.println("city is " + city);

	}
}

class emp extends Person {
	private int wages;
	private int wdays;

	public void setData() {
		super.setData();
		wages = JOptionPane("Enter the wages ");
		int wa = Integer.parseInt(wages);
		wdays = JOptionPane("Enter the wdays ");
		int wd = Integer.parseInt(wd);
	}

	public void showData() {
		super.showData();
		Systsem.out.println("the wages is " + wages);
		Systsem.out.println("the working days are " + wdays);
	}
}

class test {
	public static void main(String args[]) {

		emp p1;
		p1 = new emp();
		p1.setData();
		p1.showData();
	}
}