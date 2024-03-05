class NumFiveDigit{
	public static void main(String []args){

		int num=12345;
		
		int a=num/10000;        //1
		int b=(num/1000)%10;	//2
		int c=(num/100)%10;     //3
		int d=(num/10)%10;	    //4
		int e=num%10;			//5
		
		System.out.println("First Digit :"+a);
		System.out.println("Second Digit  :"+b);
		System.out.println("Third Digit  :"+c);
		System.out.println("Fourth Digit  :"+d);
		System.out.println("Fifth  Digit  :"+e);
		
	}
	

} 