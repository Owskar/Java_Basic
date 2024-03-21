// Hash set
import java.util.*;
class C6{
	public static void main(String args[]){
		LinkedHashSet<String>H1=new LinkedHashSet<String>();
		H1.add("Shraddha");
		H1.add("Pratiksha");
		H1.add("Kritika");
		H1.add("Sakshi");
		
		System.out.println("set is "+H1);
		
		LinkedHashSet<String>H2=new LinkedHashSet<String>();
		H2.add("Harshu");
		H2.add("Manoj");
		H2.add("Owskar");
		H2.add("Pratik");
		System.out.println("set is "+H2);
			//addAll
	H1.addAll(H2);
	System.out.println("combination of both "+H1);
	
	//remove
	H1.remove("Shraddha");
	System.out.println("Shraddha remove :"+H1);
	
	//removeAll
	H1.removeAll(H2);
	System.out.println("remove H1 :"+H1);
	
	//clear
	H2.clear();
	System.out.println("set is clear :"+H2);
	
	//isEmpty
	System.out.println("isEmpty :"+H2.isEmpty());
	
	
	//size
	System.out.println("Size :"+H1.size());
	
	
	//contains
	System.out.println("contains :"+H1.contains("Pratiksha"));
	
	//removeIf->contains
	H1.removeIf(str->str.contains("Pratiksha"));
	System.out.println("\nremove if Pratiksha is presnet :"+H1);
	
	Iterator a=H1.iterator();
	while(a.hasNext()){
		System.out.print(a.next()+" ");
	}
	
	//for each loop
	System.out.println("\nBy using for each ");
	for(String z:H1){
		System.out.print(z+" ");
	}
	}
}