/*
9) print the following pattern 
	1
	121
	12321
	1234321
	123454321
	
*/




class Q9{
	public static void main(String[] args){
		
		
		int cnt=0;
		for(int i=1; i<=5; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			
			
			for(int k=cnt; k>=0; k--){
				if(k==0){
					
				}
				else{
				System.out.print(k+" ");
				}
			}
			cnt++;
			System.out.println();
		}
	}
}