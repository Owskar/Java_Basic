import javax.swing.*;
public class A12{
	
	
	
    public static void main(String args[]) {
		String size=JOptionPane.showInputDialog("Enter the size : ");
		int s= Integer.parseInt(size);
		
		double c[] = new double[s];
		
	System.out.println("Size : "+s);
	
		for(int i=0;i<s;i++ ){
			String ele=JOptionPane.showInputDialog("Eneter the "+i+"th element");
			c[i]=Double.parseDouble(ele);
			
		}
		
		
		double s1=0;
		double s2=0;
       for(int i=0;i<s;i++){
		   System.out.print(c[i]+" ");
		   
		   if(i%2==0){
			   s1+=c[i];
		   }
		   else{
			   s2+=c[i];
		   }
		   
	   }
	   System.out.println("\nAddition even index is :"+s1);
	   System.out.println("\nAddition odd index is :"+s2);
		
        
    }
}