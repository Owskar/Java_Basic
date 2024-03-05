//ArrayIndexOutOfBoundsException

class etest{
	public static void main(String args[]){
		
		try{
			
		int a[]={7,4,10,14};
		System.out.println(a[6]);
		
		}catch(ArithmeticException e1){
			
			System.out.println("Cant divide by zero");
			
		}catch(NullPointerException e2){
			
			System.out.println("DOnt pass null pointer");
			
		}catch(ArrayIndexOutOfBoundsException e3){
			
			System.out.println(e3);
			
		}catch(Exception e4){
			System.out.println(e4);
		}
	}
}