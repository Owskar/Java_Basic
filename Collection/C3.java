import java.util.*;
class C3{
	public static void main(String args[]){
		LinkedList<String>l= new LinkedList<String>();
		
		l.add("Kritika");
		l.add("Shraddha");
		l.add("Sakshi");
		l.add("Pratiksha");
		
		System.out.println("Manoj Chi lisst "+l);
		
			LinkedList<String>A=new LinkedList<String>();
	A.add("Tanvi");
	A.add("Sakshi");
	A.add("Pratiksha");
	A.add("Sneha");
	A.add("Tanvi");
	
	
	
		//addAll
	l.addAll(A);
	System.out.println("combination of both "+l);
	
	//remove
	l.remove("Tanvi");
	System.out.println("Tanvi remove :"+l);
	
	//removeAll
	l.removeAll(A);
	System.out.println("remove A :"+l);
	
	//removeIf->contains
	A.removeIf(str->str.contains("Tanvi"));
	System.out.println("\nremove if sanjana is presnet :"+A);
	
	//clear
	l.clear();
	System.out.println("list is clear :"+l);
	
	//isEmpty
	System.out.println("isEmpty :"+l.isEmpty());
	
	
	//size
	System.out.println("Size :"+A.size());
	
	
	//contains
	System.out.println("contains :"+A.contains("shradda"));
	
	//get
	System.out.println("Get method "+A.get(2));
	
	//add()
	A.add(1,"Tanvi");
	System.out.println("Get add method "+A);
	
	//set
	A.set(1,"kritika");
	System.out.println("set method "+A);
	
	Iterator a=A.iterator();
	while(a.hasNext()){
		System.out.print(a.next()+" ");
	}
	
	//for each loop
	System.out.println("\nBy using for each ");
	for(String z:A){
		System.out.print(z+" ");
	}
	//sort
	Collections.sort(A);
	System.out.println("\nSorted list is :"+A);
	
	//addFirst()
	
	A.addFirst("Tanvi");
	System.out.println("\n addFirst :"+A);
	
	//addLast()
	
	A.addLast("Sneha");
	System.out.println("\n addLast :"+A);
	
	//removeFirst
	
	A.removeFirst();
	System.out.println("\n removeFirst()"+A);
	
	//removeLast
	A.removeLast();
	System.out.println("\n removeLast() :"+A);
	}
}