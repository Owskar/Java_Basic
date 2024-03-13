//2) write a program to count total number of elements by passing array to method 
class A5{
	static void counter(int b[]){
		int cnt=0;
		for(int i=0;i<b.length;i++){
			cnt++;
		}
		System.out.println("Number of elements are  "+cnt);
	}
	public static void main(String args[]){
		int a[]={11,15,2,22,25};
		counter(a);
	}
}