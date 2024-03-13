//6) write a program to print sum avarage mean and max from array element by passing array to 4 different methods
class A9{
	static void sum(int b[]){
		int sum=0;
		for(int i=0;i<b.length;i++){
			sum=sum+b[i];
		}
		System.out.println("The sum of array is :  "+sum);
	}
	
	static void avarage(int b[]){
		int sum=0;
		for(int i=0;i<b.length;i++){
			sum=sum+b[i];
		}
		int avg= sum/b.length;
		System.out.println("Avarge is :  "+avg);
	}
	
	static void maximum(int b[]){
		int max=b[0];
		int slar=b[0];
		for(int i=1;i<b.length;i++){
			if(max<b[i]){
				slar=max;
				max=b[i];
			}
		}
		System.out.println("Maximum element is "+max);
		System.out.println("2nd Maximum element is "+slar);
	}
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
		sum(a);
		avarage(a);
		minimum(a);
		maximum(a);
		
		
	}
}