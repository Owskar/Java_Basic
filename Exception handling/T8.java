class yatra extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName()+ " is jevayala vadanari thread");
		}
		else{
			System.out.println(Thread.currentThread().getName() + " is khadudi thread sukk vada ");
		}
	}
}


class test{
	public static void main(String args[]){
		yatra t1= new yatra();
		yatra t2= new yatra();
		yatra t3= new yatra();
		yatra t4= new yatra();
		
		t1.setName("piyusha");
		t2.setName("prathmensh");
		t3.setName("saniya");
		t4.setName("manoj");
		
		t2.setDaemon(true);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}