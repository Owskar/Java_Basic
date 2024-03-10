class bestfriend extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1000);
			}
			catch(Exception e1){
				System.out.println(e1);
			}
			if(i>5 && ((Thread.currentThread().getName()).equals("Tanvi"))){
				Thread.currentThread().yield(); //suspend() stop() 
			}
			else{
				System.out.println(Thread.currentThread().getName()+" says manoj kdhi yenar karad la "+ i+" time vicharat ahe");
				
			}
		}
	}
}
class test{
	public static void main(String args[]){
		bestfriend t1=new bestfriend();
		bestfriend t2=new bestfriend();
		bestfriend t3=new bestfriend();
		bestfriend t4=new bestfriend();
		
		t1.setName("Sneha");
		t2.setName("Pratiksha");
		t3.setName("sakshi");
		t4.setName("Tanvi");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}