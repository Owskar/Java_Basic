import java.util.*;

class C1{
public static void main(String args[]){
	ArrayList<String>A=new ArrayList<String>();
	A.add("Tanvi");
	A.add("Sakshi");
	A.add("Pratiksha");
	A.add("sneha");
	A.add("Tanvi");
	
	System.out.println("Bhawa cha MCA mdlya maitrini "+A);
	
	ArrayList<String> A2=new ArrayList<String>();
	A2.add("shradda");
	A2.add("manali");
	A2.add("sanjana");
	A2.add("Kritika");
	
	System.out.println("Bhawa cha BCA mdlya maitrini "+A2);
	
	//addAll
	A.addAll(A2);
	System.out.println("combination of both "+A);
	
	//remove
	A.remove("Tanvi");
	System.out.println("Tanvi remove :"+A);
	
	//removeAll
	A.removeAll(A2);
	System.out.println("remove A2 :"+A2);
	
	//clear
	A.clear();
	System.out.println("list is clear"+A);
	
	//isEmpty
	System.out.println("isEmpty :"+A.isEmpty());
	
	//size
	System.out.println("Size :"+A2.size());
	
	//contains
	System.out.println("contains :"+A2.contains("shradda"));
	
	
	//get
	System.out.println("Get method "+A2.get(2));
	
	//add()
	A2.add(1,"Tanvi");
	System.out.println("Get add method "+A2);
	
	//set
	A2.set(1,"kritika");
	System.out.println("set method "+A2);
	//Iterator
	//List iterator
	Iterator a=A2.iterator();
	while(a.hasNext()){
		System.out.print(a.next()+" ");
	}
	//for each loop
	System.out.println("\nBy using for each ");
	for(String z:A2){
		System.out.print(z+" ");
	}
	
	//Collections.sort
	Collections.sort(A2);
	System.out.println("\nSorted list "+A2);
	
	// remove if
	
	A2.removeIf(str->str.contains("sanjana"));
	
	System.out.println("\nremove if sanjana is presnet :"+A2);

}
}