// write a program to print addition of two matrix 

class M2{
public static void main(String args[]){
int a1[][]={{1,2,3},{4,5,6}};
int a2[][]={{7,8,9},{1,3,5}};


for(int i=0;i<=1;i++){
	for(int j=0;j<=2;j++){
		System.out.print(a1[i][j]+a2[i][j]+" ");
	}
	System.out.println();
}
}
}