

class etest{
	public static void main(String args[]){
		
		try{
		int a[]={7,4,10,14};
		int p=50/0;
		System.out.println(p);
		
		}catch(Exception e1){
			
			System.out.println(e1);
			
		}catch(NullPointerException e2){
			
			System.out.println(e2);
			
		}catch(ArrayIndexOutOfBoundsException e3){
			
			System.out.println(e3);
			
		}
	}
}