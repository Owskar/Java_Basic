/*
10) design a class pen containig
DM- company name , model, prize ,quantity
Mf- setdata, showdata,bill.

*/

class pen{
	private String Cname,model;
	private int prize,quantity;
	
	public void setData(String c,String m,int p,int q){
		Cname=c;
		model=m;
		prize=p;
		quantity=q;
	}
	public void bill(int p,int q){
		System.out.println("bill is :"+p*q);
	}
	public void showData(){
		System.out.println("Company name: "+Cname);
		System.out.println("Model :"+model);
		System.out.println("prize :"+prize);
		System.out.println("quantity "+quantity);
		
		
	}
	
}
class Q8{
	public static void main(String args[]){
		pen p=new pen();
		p.setData("t-max","432",50,3);
		p.showData();
		p.bill(50,3);
	}
}