//1) write a program for static method having data member name city univercity
//make univercity as static 

class student{
	private String name;
	private String city;
	static String univercity="Dbatu";
	
	public static void change(){
		univercity="shivaji";
	}
	
	public void setData(String n,String c){
		name=n;
		city=c;
	}
	
	public void showData(){
		System.out.println("Name is "+name);
		System.out.println("city is "+city);
		System.out.println("univercity is "+univercity);
	}
}

class que1{
	
	public static void main(String args[]){
		student s1;
		s1=new student();
		s1.setData("Owskar","Kolhapur");
		s1.showData();
		
	student.change();
		student s2;
		s2=new student();
		s2.setData("harshu","pethvadgaon");
		s2.showData();
		
		
		
	}
}