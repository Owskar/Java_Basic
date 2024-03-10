/*


design a class student containing data member
roll no , namem , branch collegename


*/

class coll{
	private int rollno;
	private String name;
	private String branch;
	static String collegename="AMGOI";
	
	static void change(){
		collegename="COEP";
	}
	
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
		System.out.println();
		
		coll c2;
		c2=new coll();
		
		c2.setData(2,"Harshu","CSE");
		c2.change();
		c2.showData();
		
	}
}