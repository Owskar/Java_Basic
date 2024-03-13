//4) write a program to count total number of seven and zero by passing array to method separately // {1,2,7,0,6,0,7,7}

class A7{
	static void counter(int b[]){
		int cnt1=0;
		int cnt2=0;
		
		for(int i=0;i<b.length;i++){
			if(b[i]==7){
				
			cnt1++;
			}else if(b[i]==0){
				cnt2++;
			}
		}
		System.out.println("total Number of 7 : "+cnt1);
		System.out.println("total Number of 0 : "+cnt2);
	}
	public static void main(String args[]){
		int a[]={1,2,7,0,6,0,7,7};
		counter(a);
	}
}