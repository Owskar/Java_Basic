// Here we get the error for last 2 catch blocks because the exception is already catch privously in e1

class etest{
	public static void main(String args[]){
		
		try{
		int a[]={7,4,10,14};
		System.out.println(a[6]);
		
		}catch(Exception e1){
			
			System.out.println(e1);
			
		}catch(NullPointerException e2){
			
			System.out.println(e2);
			
		}catch(ArrayIndexOutOfBoundsException e3){
			
			System.out.println(e3);
			
		}
	}
}