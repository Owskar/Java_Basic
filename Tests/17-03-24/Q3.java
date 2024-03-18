//3) write a progarm to remove all white space from string 

import javax.swing.*;
class Q3{
	public static void main(String args[]){
		String s=JOptionPane.showInputDialog("Enter the string :");
		System.out.println("original string :"+s);
		String ans= new String("");
		
	char ch[]=s.toCharArray();
	
	
		for(int i=0;i<s.length();i++){
			
			if(ch[i]!=' ' ){
				ans=ans+ch[i];
			}
		}
		System.out.println("updated string :"+ans);
	}
}