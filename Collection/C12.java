// LinkedHashMap



import java.util.*;
class C12{
	public static void main(String args[]){
		LinkedHashMap<Integer,String>H1=new LinkedHashMap<Integer,String>();
		H1.put(101,"Shraddha");
		H1.put(102,"Pratiksha");
		H1.put(103,"Kritika");
		H1.put(104,"Sakshi");
		H1.put(105,"Tanvi");
		
		System.out.println("List is "+H1);
		
		HashMap<Integer,String>H2=new HashMap<Integer,String>();
		H2.put(201,"Owskar");
		H2.put(202,"Shubham");
		H2.put(203,"Prathamesh");
		H2.put(204,"Manoj");
		H2.put(205,"Harshu");
		H1.putAll(H2);
		System.out.println("List is "+H1);
		
		H1.remove(101);
		System.out.println("List is "+H1);
		
		
		System.out.println("H1.containsKey(202) "+H1.containsKey(202));
		System.out.println("H1.containsValue('Owskar') "+H1.containsValue("Owskar"));
		System.out.println("H1.size :"+H1.size());
		H1.clear();
		System.out.println("H1.clear(): "+H1);
		System.out.println("H1.isEmpty(): "+H1.isEmpty());
		
		for(Map.Entry g:H2.entrySet()){
			System.out.println(g.getKey()+" "+g.getValue());
		}
		
		H2.replace(205,"Shru");
		System.out.println("H2 :"+H2);
		
		H2.replaceAll((k,v)->"Shruti");
		System.out.println("H2 :"+H2);
		
		H2.putIfAbsent(200,"sakshi");
		System.out.println("H2 :"+H2);
		
		
		System.out.println("List is :"+H2.entrySet());
		System.out.println("Key is :"+H2.keySet());
		System.out.println("Value is "+H2.values());
		
		
	}
}