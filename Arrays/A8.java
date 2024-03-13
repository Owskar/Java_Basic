// 5) write a progrma to print array elements by passing array to method and also print total number of element in array 
class A8{
	static void counter(int b[]){
		int cnt=0;
		for(int i=0;i<b.length;i++){
			cnt++;
			System.out.print(b[i]+" ");
		}
		System.out.println("\nNumber of elements are  "+cnt);
	}
	public static void main(String args[]){
		int a[]={11,15,2,22,25};
		counter(a);
	}
}