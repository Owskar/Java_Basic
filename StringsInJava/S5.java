class stest{
	public static void main(String args[]){
		// toUpperCase
		// toLowerCase
		
		String s1="Maz nav BARKI";
		
		System.out.println("Given string is "+s1);
		System.out.println("uppercase of s1  "+s1.toUpperCase());
		System.out.println("Lowercase of s1  "+s1.toLowerCase());
		

		String s2="Fakt chaha piun yete mi";
		
		
		
		
		System.out.println("s2.contains('chaha') :"+s2.contains("chaha"));
		System.out.println("s2.contains('Milk') :"+s2.contains("Milk"));
		
		

//startsWith

		System.out.println("Given String s1="+s1);
		System.out.println(s1.startsWith("Ma"));
		
		System.out.println(s1.startsWith("av"));
		
		System.out.println(s1.startsWith("Maz"));
		
//endsWith
		
		System.out.println(s1.endsWith("Maz"));
		System.out.println(s1.endsWith("nav"));
		
//charAt
		
		System.out.println(s1.charAt(4));

//Replace && Replace All

		System.out.println(s1.replace("a","A")); 	

		System.out.println(s1.replaceAll("nav","name"));	
		
//indexOf

			System.out.println(s1.indexOf("v"));
			System.out.println(s1.indexOf("nav"));
			
//lastIndexOf

			System.out.println(s1.lastIndexOf("a"));
			
//trim

	String p="Prathmesh       ";
	
	System.out.println(p+"yay lagty bhawa");
	System.out.println(p.trim()+" yay lagty bhawa");
	
//isEmpty()

	String owskar="Radha";
	
	String manoj="";
	System.out.println("Is owskar is single ? "+owskar.isEmpty());
	System.out.println();
	System.out.println("Is Manoj is single ? "+manoj.isEmpty());
	
//substring

String s="Shruti kasi aahe Patya";
System.out.println(s.substring(7,18));
System.out.println(s.substring(7));

//join

String A=String.join("prathmesh  ","harsha  ","  Piyusha  ","  saniya  ","Shrawani ");
	System.out.println(A);
		
	}
}