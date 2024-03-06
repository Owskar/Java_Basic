class myThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Child Thread is running");
		}
	}
}

class mtest{
	public static void main(String args[]){
		myThread t1= new myThread();
		myThread t2= new myThread();
		System.out.println("Main Thread is Running ");
		t1.start();
		t2.start();

	}
}