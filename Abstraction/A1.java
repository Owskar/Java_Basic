abstract class circle{
	int r;
	public void setRadius(int x){
		r=x;
	}
	abstract public void area();
	
	
}
class Ncircle extends circle{
	public void circum(){
		double cir=2*3.14*r;
		System.out.println("Circumference of cicle :"+cir);
	}
	public void area(){
		double a=3.14*r*r;
		System.out.println("Area of circle :"+a);
	}
}

class test{
	public static void main(String args[]){
		Ncircle N;
		N=new  Ncircle();
		N.setRadius(5);
		N.circum();
		N.area();
		
	}
}