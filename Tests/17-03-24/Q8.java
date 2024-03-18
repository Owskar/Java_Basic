//8) write a program to reamove duplicate elements from array {4,3,2,4,4,7}

import javax.swing.*;
import java.util.*;
class Q8{
	public static void main(String args[]){
		int arr[]={4,3,2,4,4,7};
		int s=arr.length;
		ArrayList<Integer>A=new ArrayList<Integer>();
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]!=arr[j]){
				A.add(arr[i]);
			}
			else{
				int a=arr[j];
				A.remove(a);
				break;
				
			}
			}
			
		}
		
		
		
		System.out.println("arraylist :"+A);
		
	}
}

