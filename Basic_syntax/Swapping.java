/*
write a program to swap two number using third varable;



*/

class Swapping{
	
public static void main(String []args){
	int a=10;
	int b=45;
	System.out.println("Before swapping");
	System.out.println("A="+a+" B="+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping");
	System.out.println("A="+a+" B="+b);
}
}