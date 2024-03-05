class stest{
public static void main(String args[]){
	String gf="Shruti";
	String aaichisun="SHRuti";
	// equals()
	if(gf.equalsIgnoreCase(aaichisun)){
		System.out.println("Made for each other ");
	}
	else{
		System.out.println("Kahitr rada zal ahe");
	}
	
	//split
	
	String s1="Helllo prathamesh i am shruti";
	
	System.out.println(s1);
	
	String w[]=s1.split("\\s");
	for(String s2:w){
		System.out.println(s2);
	}
	
	//write a program to read a strig and count the words
	
	
}
}