//1) write a program to get maximum element by passing array to method 
class A4{
	static void maximum(int b[]){
		int max=b[0];
		for(int i=1;i<b.length;i++){
			if(max<b[i]){
				max=b[i];
			}
		}
		System.out.println("Maximum element is "+max);
	}
	public static void main(String args[]){
		int a[]={11,15,2,22,25};
		maximum(a);
	}
}