class Homework{
	public static void main(String []args){

		int num=1234;
		
		int a=num/1000;       //1
		int b=(num/100)%10;	  //2
		int c=(num/10)%10;    //3
		int d=num%10;		  //4
		
		
		System.out.println("First Digit :"+a);
		System.out.println("Second Digit  :"+b);
		System.out.println("Third Digit  :"+c);
		System.out.println("Fourth Digit  :"+d);
	}
	

} 