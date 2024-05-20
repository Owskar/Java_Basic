//4) implement 5 method of treemap
import java.util.*;
class Q4{
	public static void main(String args[]){
		TreeMap<Integer,String>a=new TreeMap<Integer,String>();
		a.put(1,"PethVadgaon");
		a.put(2,"sambhapur");
		a.put(3,"sheroli");
		a.put(4,"Nagaw");
		a.put(5,"tawde hotel");
		a.put(6,"CBS");
		a.put(7,"railwayFatak");
		a.put(8,"ShahuMaidan");
		a.put(9,"VijayBekri");

		
		System.out.println("Class : "+a);
		System.out.println("Class to Home"+a.descendingMap());
		
		System.out.println("headMap :"+a.headMap(5,false));
		System.out.println("tailMap :"+a.tailMap(6,true));
		System.out.println("submap :"+a.subMap(4,true,8,false));
		
		
	}
}