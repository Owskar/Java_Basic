//4) wrie a program to print total number of vovels in a stirng 
//read string from user
import javax.swing.*;
class Q4{
	public static void main(String args[]){
		String s1=JOptionPane.showInputDialog("Enter the string :");
		
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		
		int l=s1.length();
		for(int x=0;i<l;i++){
			if(s1.charAt(i)=='a'){
				a=a+1;
			}
			else if(s1.charAt(i)=='e'){
				e++;
			}
			else if(s1.charAt(i)=='i'){
				i++;
			}
			else if(s1.charAt(i)=='o'){
				o++;
			}
			else if(s1.charAt(i)=='u'){
				u++;
			}
			
			
		}
		
		
		
		
		
		System.out.println("a "+a);
		System.out.println("e "+e);
		System.out.println("i "+i);
		System.out.println("o "+o);
		System.out.println("u "+u);
		
		
	}

}



