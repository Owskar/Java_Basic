/*

class name student
			roll no 
			name
			sub
			sub2
			sub3
			sub4
			sub5
	MF-		setData()
			showData()
			result()
			

*/

class Student{
	
	private String Name;
	private int RollNO;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	
	
	public void setData(String nm,int r,int s1,int s2,int s3,int s4,int s5){
		Name=nm;
		RollNO=r;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
		sub5=s5;
	}
	public void result(int s1,int s2,int s3,int s4,int s5){
		int totalMarks=s1+s2+s3+s4+s5; 
		double percentage=totalMarks/5;
		System.out.println("Total Marks are :"+totalMarks);
		System.out.println("Total percentage is :"+percentage);
		
	}
	
	public void showData(){
		System.out.println("Student name is :"+Name);
		System.out.println("Student RollNO is :"+RollNO);
		System.out.println("Subject 1 marks are :"+sub1);
		System.out.println("Subject 2 marks are :"+sub2);
		System.out.println("Subject 3 marks are :"+sub3);
		System.out.println("Subject 4 marks are :"+sub4);
		System.out.println("Subject 5 marks are :"+sub5);
		result(sub1,sub2,sub3,sub4,sub5);
		
		
	}
	
}


class Stu{
	
	public static void main(String []args){
		Student s1;
		s1=new Student();
		s1.setData("Owskar",1,70,89,90,67,78);
		s1.showData();
		
	}
}