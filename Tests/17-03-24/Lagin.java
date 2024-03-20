import java.util.*;

class Marriage{
	String uname,edu,job,property,look,dist,family,speccon;
	int age,sal,bal;
	double height;
	
	public Marriage(String uname,String edu,String job,String property,String look,String dist,String family,int age,int sal,int bal, double height,String speccon)
	{
			this.uname = uname;
			this.edu = edu;
			this.job = job;
			this.property = property;
			this.look = look;
			this.speccon = speccon;
			this.dist = dist;
			this.family = family;
			this.age = age;
			this.sal = sal;
			this.bal = bal; 
			this.height = height;
	}
}

class Atest{
		public static void main(String args[])
		{
			Marriage shubham = new Marriage("Shubham","B.Tech CSE","Developer","House","Fair","Kolhapur-Sangli","Nuclear",27,40000,1000000,5.6,"All-rounder"); 
			Marriage Harshu = new Marriage("Harshu","B.Tech CSE","Developer","House and 12 Acre land","Fair","Kolhapur","Nuclear",27,0,30000,5.4,"Good in Cooking"); 
			Marriage Owskar = new Marriage("Owskar","B.Tech CSE","Developer","4 House","Fair","Kolhapur","Nuclear",27,0,0,5.5,"Intelligent"); 
			Marriage Virat = new Marriage("Virat","Graduate","House-wife","House","Medium","Pune","Join",25,100000,1000000,5.8,"No Expectations");
			
			ArrayList <Marriage> M1 = new ArrayList<Marriage>();
			
			M1.add(shubham);
			M1.add(Harshu);
			M1.add(Owskar);
			M1.add(Virat);
			System.out.println("************************************************************** Matrimonial Website **************************************************************\n");
			for(Marriage s:M1)
			{
				System.out.println("Matrimonial data of "+s.uname+"\n");
				
				System.out.println(" \nEducation:- "+s.edu+"\nExpected Job Title:- "+s.job+"\nProperty:- "+s.property+"\nLook:- "+s.look+"\nDistrict:- "+s.dist+"\nFamily:- "+s.family+"\nAge:- "+s.age+"\nExpected Salary:- "+s.sal+"\nExpected Bank balance:- "+s.bal+"\nHeight:- "+s.height+"\nSpecial Condition:- "+s.speccon);
				System.out.println("");
			}
			
		}
}