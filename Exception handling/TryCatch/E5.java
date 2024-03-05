//Use of finally

class etest{
	public static void main(String args[]){
		
		try{
		int n=70/0;
		}catch(ArrayIndexOutOfBoundsException e3){
			System.out.println("Please dont divide by zero");
		}finally{
			System.out.println("I am always executed ");
		}
	}
}