//write a program to get minimum number / smallest number by passing array to method
class A3{
	static void minimum(int b[]){
		int min=b[0];
		for(int i=1;i<b.length;i++){
			if(min>b[i]){
				min=b[i];
			}
		}
		System.out.println("Minimum element is "+min);
	}
	public static void main(String args[]){
		int a[]={11,15,2,22,25};
		minimum(a);
	}
}