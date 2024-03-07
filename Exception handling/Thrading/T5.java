class NMT extends Thread{
	public void run(){
		System.out.println("Thread is Runnig");
	}
}
class test{
	public static void main(String args[]){
		NMT t1=new NMT();
		NMT t2=new NMT();
		NMT t3=new NMT();
		
		System.out.println("Before Barsh name of t1 is "+ t1.getName());
		System.out.println("Before Barsh name of t2 is "+ t2.getName());
		System.out.println("Before Barsh name of t3 is "+ t3.getName());
		
		t1.setName("Shraddha");
		t2.setName("Akanksha");
		t3.setName("Vishakha");
		
		System.out.println("After Barsh name of t1 is "+ t1.getName());
		System.out.println("After Barsh name of t2 is "+ t2.getName());
		System.out.println("after Barsh name of t3 is "+ t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
		
}
}