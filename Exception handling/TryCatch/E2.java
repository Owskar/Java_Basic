class etest{
	public static void main(String args[]){
		try{
			int n=70/0;
			System.out.println("Rest of code ");
		}
		catch(ArithmeticException e1){
			System.out.println(e1);
		}
		System.out.println("Rest of code ");
	}
}