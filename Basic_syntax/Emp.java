/*

design a class with data member
emp id name and city
make city as a static 
*/

class Emp{
	private int empid;
	private String name;
	static String city="Kolhapur";
	public Emp(int ei,String nm){
		empid=ei;
		name=nm;
	}
	
	public void showData(){
		System.out.println("Emp id is "+empid);
		System.out.println("Emp name is "+name);
		System.out.println("City is "+city);
	}
}

class Etest{
	
	
	public static void main(String args[]){
		Emp e1;
		e1=new Emp(1001,"Owskar");
		
		Emp e2;
		e2=new Emp(111,"Harshu");
		
		Emp e3;
		e3=new Emp(123,"Manoj");
		
		e1.showData();
		System.out.println();
		e2.showData();
		System.out.println();
		e3.showData();
		
	}
}