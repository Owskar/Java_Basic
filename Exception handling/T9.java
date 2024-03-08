class PMT extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
}


class test{
	
	public static void main(String args[]){
		
		PMT t1= new PMT();
		PMT t2= new PMT();
		PMT t3= new PMT();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.setName("Tanvi");
		t2.setName("Pratiksha");
		t3.setName("Sakshi");
		
		t1.start();
		t2.start();
		t3.start();
		
	}


}