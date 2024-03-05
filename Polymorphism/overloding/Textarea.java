/*
Text area
DM-
	r,l,b,h
	
MF- 
Area(r)
Area(l,b)
Area(l,b,h)

	

*/



class Textarea{
	
	public void Area(double r){
		double radious=3.14*r*r;
		System.out.println("text area of circle "+radious);
	}
	
	public void Area(double b,double l){
		double s=l*b;
		System.out.println("text area of ractangle "+s);
	}
	
	public void Area(double l, double b, double h){
		double s=l*b*h;
		System.out.println("text area box "+s);
		
	}
		
}

class stest{
	public static void main(String args[]){
		
		
		Textarea t1= new Textarea();
		t1.Area(3);
		t1.Area(3,4);
		t1.Area(3,4,5);
	}
}