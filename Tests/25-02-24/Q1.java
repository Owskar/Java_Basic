//1) write a program for different string comparison method

class Q1{
	public static void main(String args[]){
		String s1="passion";
		String s2="passion";
		String s3=new String("passion");
		String s4="bullet";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		
	}
}