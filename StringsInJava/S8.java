class stest {
	public static void main(String args[]) {
		String s = "";
		String p = "nayan";

		System.out.println("Given string is " + p);
		char ch[] = p.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			s = s + ch[i];
		}
		System.out.println("reverse string is " + s);

		if (p.equals(s)) {
			System.out.println(p + " is palindrome ");
		}
	}
}

/*
 * getChars
 * getBytes
 * isBlank
 * format
 * 
 * 
 */