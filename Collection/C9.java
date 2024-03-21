// PriorityQueue



import java.util.*;
class C9{
	public static void main(String args[]){
		PriorityQueue<String>H1=new PriorityQueue<String>();
		H1.add("Shraddha");
		H1.add("Pratiksha");
		H1.add("Kritika");
		H1.add("Sakshi");
		
		System.out.println("List is "+H1);
		System.out.println("peek is "+H1.peek());
		System.out.println("Element is "+H1.element());
		H1.offer("piyusha");
		System.out.println("List of "+H1);
		H1.remove();
		System.out.println("List is "+H1);
		H1.poll();
		System.out.println("List is "+H1);
	}
}