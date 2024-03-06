class myThread implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Child Thread is running "+i);
		}
	}
}

class mtest{
	public static void main(String args[]){
		myThread r= new myThread();
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		
		t1.start();
		t2.start();
		System.out.println("Main Thread is Running ");

	}
}