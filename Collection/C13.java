// TreeMap

import java.util.*;
class C13{
	public static void main(String args[]){
		TreeMap<Integer,String>H1=new TreeMap<Integer,String>();
		H1.put(1,"Kurne gali");
		H1.put(2,"Nadivarcha pul");
		H1.put(3,"Hanuman Nagar");
		H1.put(4,"shiyefate");
		H1.put(5,"vck college");
		H1.put(6,"RTO office");
		H1.put(7,"Bhagwa chouk");
		H1.put(8,"Factory chouk ");
		H1.put(9,"pitali ganpati");
		H1.put(10,"Z.p chouk");
		
		System.out.println("baghayla jaayacha root "+H1);
		System.out.println("Is root se dulhan hum le ayenge "+H1.descendingMap());
		
		System.out.println("headMap :"+H1.headMap(5,false));
		System.out.println("tailMap :"+H1.tailMap(6,true));
		System.out.println("submap :"+H1.subMap(4,true,8,false));
		
		
	}
}