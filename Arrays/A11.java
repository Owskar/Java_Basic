// Addition of array by taking the userinput array
import javax.swing.*;
public class A11{
	
	
	
    public static void main(String args[]) {
		String size=JOptionPane.showInputDialog("Enter the size : ");
		int s= Integer.parseInt(size);
		
		double c[] = new double[s];
		
	System.out.println("Size : "+s);
	
		for(int i=0;i<s;i++ ){
			String ele=JOptionPane.showInputDialog("Eneter the "+i+"th element");
			c[i]=Double.parseDouble(ele);
			
		}  
		
		double add=0;
       for(int i=0;i<s;i++){
		   System.out.print(c[i]+" ");
		   add=add+c[i];
	   }
	   System.out.println("\nAddition is :"+add);
		
        
    }
}