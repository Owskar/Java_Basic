/*


design a class student containing data member
roll no , name , branch collegename


*/

class coll{
	private int rollno;
	private String name;
	private String branch;
	static String collegename="AMGOI";
	
	public void setData(int r, String nm, String br){
		name=nm;
		branch=br;
		rollno=r;
	}
	public void showData(){
		System.out.println("Name is "+name);
		System.out.println("Rollno is "+rollno);
		System.out.println("branch is "+branch);
		System.out.println("college is "+collegename);
	}
}

class college{
	public static void main(String args[]){
		coll c1;
		c1=new coll();
		
		c1.setData(1,"owskar","CSE");
		c1.showData();
		
	}
}