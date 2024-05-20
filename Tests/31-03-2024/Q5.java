//5) write a program to implement class as immutable 

final class std{
	private String Fname="Owskar";
	private String Lname="Ganbawale";
	
	public void showData(){
		System.out.println("First name :"+Fname);
		System.out.println("Last name :"+Lname);
	}
}

class test{
	public static void main(String args[]){
		std s=new std();
		s.showData();
	}
}