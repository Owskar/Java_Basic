/*
   
7)

#****
*#***
**#**
***#*
****#


1
22
333
4444
55555



*/

class pat{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i!=j){
					System.out.print("*");
				}
				else{
					System.out.print("#");
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		
		
		
		
	}
}