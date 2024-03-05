class stest{
	public static void main(String args[]){
		
//split
		int c=0;
		String s1="I hate bullet but i love RX100";
		System.out.println(s1);
		String w[]=s1.split("\\s");
		for(String s2:w){
			c++;
		}
		System.out.println("no of word is "+c);
		
		
//intern 																	
		String A1="passion";
		String A2="splender";
		String A3=new String("passion");
		String A4=A3.intern();
		String A5="passion";
		
		System.out.println(A1==A2);//f
		System.out.println(A1==A3);//f
		System.out.println(A1==A4);//t
		System.out.println(A1==A5);//t
		
//toCharArray
	String p="party la kay pahije";
	System.out.println("Given string is "+p);
	char ch[]=p.toCharArray();
	for(int i=0;i<ch.length;i++){
		System.out.println(ch[i]);
	}
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	for(int i=ch.length-1;i>=0;i--){
		System.out.println(ch[i]);
	}
	String s="";
	for(int i=ch.length-1;i>=0;i--){
		s=s+ch[i];
	}
	System.out.println(s);
}
}