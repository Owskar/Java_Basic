//2) perform any 12 method of string 

class stest{
	public static void main(String args[]){
		// 1)toUpperCase
		// 2) toLowerCase
		
		String s1="Heyy its me Owskar";
		
		System.out.println("Given string is "+s1);
		System.out.println("uppercase of s1  "+s1.toUpperCase());
		System.out.println("Lowercase of s1  "+s1.toLowerCase());
		

		String s2="I am from pethVadgaon";
		
		
		
		
		System.out.println("s2.contains('from') :"+s2.contains("from"));
		System.out.println("s2.contains('kolhapur') :"+s2.contains("kolhapur"));
		
		

	//3) startsWith

		System.out.println("Given String s1="+s1);
		System.out.println(s1.startsWith("Heyy"));
		
		System.out.println(s1.startsWith("av"));
		
		System.out.println(s1.startsWith("He"));
		
//4) endsWith
		
		System.out.println(s1.endsWith("pethVadgaon"));
		System.out.println(s1.endsWith("kolhapur"));
		
//5) charAt
		
		System.out.println(s1.charAt(4));

// 6) & 7) Replace && Replace All

		System.out.println(s1.replace("a","A")); 	

		System.out.println(s1.replaceAll("pethVadgaon","kolhapur"));	
		
//8) indexOf

			System.out.println(s1.indexOf("p"));
			System.out.println(s1.indexOf("pethVadgaon"));
			
//9) lastIndexOf

			System.out.println(s1.lastIndexOf("a"));
			
//10) trim

	String o="owskar      ";
	
	System.out.println(o+" Ganbawale");
	System.out.println(o.trim()+" Ganbawale");
	
//11) isEmpty()

	String owskar="Owskar";
	
	String Harshu="";
	System.out.println("Is owskar :"+owskar.isEmpty());
	System.out.println();
	System.out.println("Is Manoj :"+Harshu.isEmpty());
	
//12 substring

String s="Hello i am owskar ganbawale";
System.out.println(s.substring(7,18));
System.out.println(s.substring(7));

//13) join

String A=String.join("Owskar  ","harsha  ","  Sonu  ","  snehal ","shruti");
	System.out.println(A);
		
	}
}