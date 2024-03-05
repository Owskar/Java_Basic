// write a program a design a swich case for ATM presss d for deposit w for withdrawl b for balance inquary e for exit


import javax.swing.*;
class Swich1{
	
	public static void main(String []args){
		String A=JOptionPane.showInputDialog("Enter the Option d for deposit \n w for withdrawl b for balance \n and e for exit");
		int balance=10000;
		switch(A){
			
			case "d": 	String amt=JOptionPane.showInputDialog("Enter the amount you want to add ");
						int a=Integer.parseInt(amt);
						balance=balance+a;
						System.out.println("Now your balance is "+balance);
						break;
			case "w": 	String with=JOptionPane.showInputDialog("Enter the amount you want to withdrawl");
						int w=Integer.parseInt(with);
						if(balance>=w){
						System.out.println("your currant balance is "+(balance-w));
						break;
						}else{
							System.out.println("Insufficiant funds  !!!");
						}
			case "b": System.out.println("Your current balace is "+balance);
						break;
			case "e": break;
			default : System.out.println();
						break;
			
		}
	}
}