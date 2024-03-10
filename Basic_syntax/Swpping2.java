/*
write a program to swap two number without useing third varable;



*/

class Swapping2{
	
public static void main(String []args){
	int a=10;
	int b=45;
	System.out.println("Before swapping");
	System.out.println("A="+a+" B="+b);
	a=a+b;
	b=a-b;
	a=b-a;
	System.out.println("after swapping");
	System.out.println("A="+a+" B="+b);
}
}