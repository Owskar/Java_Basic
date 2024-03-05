// design a class person containing a data member name city age 
// member function set data ,show data


 class Person{
	 
	 
	 private String name;
	 private String city;
	 private int age;
	 
	 public void setData(String nm,String c,int a){
		
		 name=nm;
		 city=c;
		 age=a;
	 }
	 public void showData(){
		
		 System.out.println("Name is "+name);
		 System.out.println("City is "+city);
		 System.out.println("Age is "+age);
		 System.out.println();
	 }
 }
 
 class Stest{
	 public static void main(String []args){
		 
		 Person p1;
		 p1= new Person();
		 p1.setData("Owskar","Peth vadgaon",22);
		 p1.showData();
		 
		 Person p2;
		 p2= new Person();
		 p2.setData("Shubham","Savarde",23);
		 p2.showData();
	 }
 }