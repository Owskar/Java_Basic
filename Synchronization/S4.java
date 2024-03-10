class S4{
	public static void main(String args[]){
		StringBuffer s1= new StringBuffer("prathamesh");
		System.out.println(s1);
		//Methods in StringBuffer 
		
		//append
		
		s1.append(" Shruti");
		System.out.println(s1);
		
		//insert
		s1.insert(11," Like ");
		System.out.println(s1);
		
		//replace
		s1.replace(0,11,"Owskar");
		System.out.println(s1);
		
		//delete
		s1.delete(7,12);
		System.out.println(s1);
		
		// reverse
		
		s1.reverse();
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
		StringBuffer s2= new StringBuffer("");
		//capacity
		
		System.out.println(s2.capacity());
		
		s2.append("Owskar");
		System.out.println(s2.capacity());
		
		s2.append("chala pune shruti ke sang ");
		
		System.out.println("s2 is "+s2+ "capacity is "+ s2.capacity());
		// formula of capacity : - (old_capacity*2+2) 		
		
	}
}