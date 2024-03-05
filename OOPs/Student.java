 class Student{
	 
	 private int RollNo;
	 private String name;
	 private String branch;
	 private double percentage;
	 
	 public void setData(int rn, String nm,String br,double p){
		 RollNo=rn;
		 name=nm;
		 branch=br;
		 percentage=p;
	 }
	 public void showData(){
		 System.out.println("Roll NO is "+RollNo);
		 System.out.println("Name is "+name);
		 System.out.println("Branch is "+branch);
		 System.out.println("Percentage is "+percentage+"%");
		 System.out.println();
	 }
	 

 }
 
 class Stest{
	 public static void main(String []args){
		 
		 Student s1;
		 s1= new Student();
		 s1.setData(1,"Owskar","CSE",71.44);
		 s1.showData();
		 
		 Student s2;
		 s2= new Student();
		 s2.setData(2,"Shubham","Electric",77);
		 s2.showData();
	 }
 }