/*
change the city of employee


*/
class emp{
	private int empid;
	private String Ename;
	private String jobtitle;
	static String city="Kolhapur";
	
	static void change(){
		city="Pune";
	}
	
	public void setData(int r, String nm, String br){
		Ename=nm;
		jobtitle=br;
		empid=r;
	}
	public void showData(){
		System.out.println("Name is "+Ename);
		System.out.println("Employee id is "+empid);
		System.out.println("Job title is "+jobtitle);
		System.out.println("City name is "+city);
	}
}

class Empcity{
	public static void main(String args[]){
		emp c1;
		c1=new emp();
		
		c1.setData(1001,"owskar","SDE");
		c1.showData();
		System.out.println();
		
		emp c2;
		c2=new emp();
		
		c2.setData(1002,"Harshu","Front-end Developer");
		c2.change();
		c2.showData();
		
	}
}