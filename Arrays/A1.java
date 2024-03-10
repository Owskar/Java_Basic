class A1{
	public static void main(String args[]){
		int a[]=new int[7];
		a[0]=10;
		a[1]=20;
		a[2]=35;
		a[3]=45;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		// itrators
		
		for(int a1:a){
			System.out.println(a1);
		}
		
					
		
	}
}