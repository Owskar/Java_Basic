/*

class name emp
		emp id
		name
		job
		wages
		wday
		
Member function- setData
				 showData
				 Payment


*/

class Employee{
	
	private int EmpId;
	private String name;
	private String Job;
	private int wages;
	private int wday;
	private int TotalPayment;
	
	
	public void setData(int EI,String nm,String j,int w,int wd){
		EmpId=EI;
		name=nm;
		Job=j;
		wages=w;
		wday=wd;
	}
	
	public int Payment(int w,int wd){
		TotalPayment=w*wd;
		return TotalPayment;
	}
	
	public void showData(){
		System.out.println("Employee Name:"+name);
		System.out.println("Employee ID:"+EmpId);
		System.out.println("Employee Job title:"+Job);
		System.out.println("Employee wages:"+wages);
		System.out.println("Employee working days:"+wday);
		System.out.println("Employee Total payment:"+Payment(wages,wday));
		
	}
	
}


class Etest{
	public static void main(String args[]){
	Employee e1;
	e1= new Employee();
	e1.setData(1001,"owskar","Softwere developer",1000,24);
	e1.showData();
	}
}