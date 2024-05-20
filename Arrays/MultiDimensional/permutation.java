class test{

	static void permute(String s, String ans){
		if(s.length()==0){
			System.out.print(ans+" ");
		}
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			String l_substring=s.substring(0,i);
			String r_substring=s.substring(i+1);
			String rest=l_substring+r_substring;
			
			permute(rest,ans+ch);
		}
	}
	
	public static void main(String args[]){
		String s="abcd";
		String ans="";
		permute(s,ans);
	}

}