import java.util.*;
class C4{
	public static void main(String args[]){
		Stack<String>S=new Stack<String>();
		
		S.push("Sonali");
		S.push("Piyusha");
		S.push("Saniya");
		S.push("Shrawani");
		S.push("Sofiya");
		S.push("Sheefa");
		
		System.out.println("Stack is "+S);
		System.out.println("Empty "+S.empty());
		System.out.println("Size "+S.size());
		System.out.println("search "+S.search("Sofiya"));
		S.pop();
		System.out.println("pop "+S);
	}
}