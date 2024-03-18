// Vector
import java.util.*;
class C2{
	public static void main(String args[]){
		Vector<String>l= new Vector<String>();
		
		l.add("Kritika");
		l.add("Shraddha");
		l.add("Sakshi");
		l.add("Pratiksha");
		
		System.out.println("Manoj Chi lisst "+l);
	Vector<String>A=new Vector<String>();
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
	
	
	//Collections.sort
	Collections.sort(A);
	System.out.println("\nSorted list "+A);
	
	// remove if
	
	A.removeIf(str->str.contains("sanjana"));
	
	System.out.println("\nremove if sanjana is presnet :"+A);

	//addElement
	A.addElement("Pratiksha");
	
	System.out.println("\naddElement(Pratiksha) :"+A);
	
	//Capacity
	System.out.println("Capacity of vector is "+qA.capacity());
	
	//removeElement
	A.removeElement("Pratiksha");
	System.out.println("\nremoveElement(Pratiksha) :"+A);
	
	//removeElementAt
	A.removeElementAt(1);
	System.out.println("\nremoveElementAt(1) :"+A);
	
	//Hashcode
	System.out.println("Hashcode :"+A.hashCode());
	}
}