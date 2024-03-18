//2) write a program to find second highest in array (user  input array )
import java.util.*;
import javax.swing.*;
class Q2{
	public static void main(String args[]){
		String size=JOptionPane.showInputDialog("Enter the size of array:");
		int s=Integer.parseInt(size);
		
		int arr[]=new int[s];
		
		for(int i=0;i<s;i++){
			String ele=JOptionPane.showInputDialog("Enter the element at index "+i);
			arr[i]=Integer.parseInt(ele);
		}
		System.out.print("original array :");
		for(int i=0;i<s;i++){
			System.out.print(arr[i]+" " );
		}
		
		
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int secondL=arr[arr.length-2];
		
		
		System.out.println("\nlargest "+largest);
		
		System.out.println("\nSecond largest "+secondL);
		
	}
}