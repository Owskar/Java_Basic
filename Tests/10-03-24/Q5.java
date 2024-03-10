
class Anyone extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		try{
			Thread.join(1000);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName()+i);//getName
		}
	}
}

class test{
	public static void main(String args[]){
		Anyone m= new Anyone();
		Anyone o= new Anyone();
		Anyone p= new Anyone();
		
		o.setName("owskar");//setName
		m.setName("Manoj");
		p.setName("prathamesh");
		
		
		o.start();
		m.start();
		p.start();
		
	}

}