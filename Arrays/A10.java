import javax.swing.*;
public class A10 {
	
	static void NewArr(int c[],int s){
		
		System.out.println("\nSize : "+s);
		for(int i=0;i<s;i++ ){
			String ele=JOptionPane.showInputDialog("Eneter the "+i+"th element");
			c[i]=Integer.parseInt(ele);
			
		}
		
       for(int i=0;i<s;i++){
		   System.out.print(c[i]+" ");
	   }

	}
	
	
    public static void main(String args[]) {
		String size=JOptionPane.showInputDialog("Enter the size : ");
		int s= Integer.parseInt(size);
		
		int c[] = new int[s];
		
	System.out.println("Size : "+s);
		for(int i=0;i<s;i++ ){
			String ele=JOptionPane.showInputDialog("Eneter the "+i+"th element");
			c[i]=Integer.parseInt(ele);
			
		}
		
       for(int i=0;i<s;i++){
		   System.out.print(c[i]+" ");
	   }
	   // By using method 
	   
	   int a[] = new int[s];

		NewArr(a,s);
		
        
    }
}