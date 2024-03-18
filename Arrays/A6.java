//3) write a program to count total number of four by passing array to method // {1,2,3,4,5,4,4,6,7}

class A6{
	static void counter(int b[]){
		int cnt=0;
		for(int i=0;i<b.length;i++){
			if(b[i]==4){
				
			cnt++;
			}
		}
		System.out.println("total Number of 4 : "+cnt);
	}
	
	public static void main(String args[]){
		int a[]={1,2,3,4,5,4,4,6,7};
		counter(a);
	}
}