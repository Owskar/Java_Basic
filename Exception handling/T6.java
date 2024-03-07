class chick65 extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1000);
			}
			catch(Exception e1){
				System.out.println(e1);
			}
			System.out.println(Thread.currentThread().getName()+" Apala chicken ch piece no "+ i+" Khat ahe ");
		}
	}
}
class test{
	public static void main(String args[]){
		chick65 t1=  new chick65();
		chick65 t2=  new chick65();
		chick65 t3=  new chick65();
		
		t1.setName("saniya");
		t2.setName("Shubham");
		t3.setName("Darsha");
		
		t1.start();
		t2.start();
		t3.start();
	}
}