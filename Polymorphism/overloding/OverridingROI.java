//RBI
class RBI{
	public int roi(){
		return 0;
	}
}

class SBI extends RBI{
	public int roi(){
		return 8;
	}
}

class BOB extends RBI{
	public int roi(){
		return 9;
	}
}

class ICICI extends RBI{
	public int roi(){
		return 10;
	}
}

class HDFC extends RBI{
	public int roi(){
		return 11;
	}
}

	
class rtest{
	public static void main(String []args){
		SBI s1=new SBI();
		BOB b1=new BOB();
		ICICI i1=new ICICI();
		HDFC h1=new HDFC();
		
		
		
		System.out.println("ROI of SBI "+s1.roi());
		System.out.println("ROI of BOB "+b1.roi());
		System.out.println("ROI of ICICI "+i1.roi());
		System.out.println("ROI of HDFC "+h1.roi());
		
	}
}