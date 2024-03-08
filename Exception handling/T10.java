class IMT extends Thread{
	public void run(){
		System.out.println("Thread is running ");
	}
}


class test{
	
	public static void main(String args[]){
		
		IMT t1= new IMT();
		IMT t2= new IMT();
		IMT t3= new IMT();
		
		System.out.println("ID of Thread t1 is "+t1.getId());
		System.out.println("ID of Thread t2 is "+t2.getId());
		System.out.println("ID of Thread t3 is "+t3.getId());
		
		t1.start();
		t2.start();
		t3.start();
		
	}


}