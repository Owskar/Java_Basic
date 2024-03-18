//4) write a program to find all pairs of elements in an array whose sum is equql to given number {4,5,7,11,9,13,8,12}=20

import javax.swing.*;
class Q4{
	public static void main(String args[]){
		int arr[]={4,5,7,11,9,13,8,12};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==20){
					System.out.println(arr[i] + " and "+arr[j]);
				}
			}
		}
		
	
	}
}