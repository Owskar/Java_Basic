// Overloding
class Addition{
	
public void sum(int a, int b){
	int s=a+b;
	System.out.println("sum is "+s);
}


public void sum(int a, int b,int c){
	int s=a+b+c;
	System.out.println("sum is "+s);
}

}

class stest{
	public static void main(String args[]){
		Addition a1= new Addition();
		a1.sum(4,5);
		a1.sum(7,4,5);
	}
}