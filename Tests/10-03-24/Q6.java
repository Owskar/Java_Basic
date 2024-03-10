

class Anyone1 extends Thread{
	synchronized public void run(){ // dedlockkk handle
		for(int i=0;i<10;i++){
		try{
			Thread.sleep(1000);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName()+i);
		}
	}
}

class test{
	public static void main(String args[]){
		Anyone1 m= new Anyone1();
		Anyone1 o= new Anyone1();
		Anyone1 p= new Anyone1();
		
		o.setName("owskar");
		m.setName("Manoj");
		p.setName("prathamesh");
		
		
		o.start();
		m.start();
		p.start();
		
	}

}