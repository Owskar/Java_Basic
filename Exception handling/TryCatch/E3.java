//ArithmeticException 

class etest{
	public static void main(String args[]){
		try{
			int n=70/0;
			
		}
		catch(ArithmeticException e1){
			System.out.println("Please dont divide by zero");
		}
		System.out.println("Rest of code ");
	}
}