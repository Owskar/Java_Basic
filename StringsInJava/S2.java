class stest{
public static void main(String args[]){
String Manoj="Passion";
String Shubham="Passion";
String Owskar=new String("Passion");
String prathmesh="Splender";

System.out.println(Manoj.equals(Shubham));//t
System.out.println(Manoj.equals(Owskar));//t
System.out.println(Manoj.equals(prathmesh));//f

System.out.println(Manoj==Shubham);//t
System.out.println(Manoj==Owskar);//f
System.out.println(Manoj==prathmesh);//f

System.out.println(Manoj.compareTo(Shubham));//0
System.out.println(Manoj.compareTo(Owskar));//0
System.out.println(Manoj.compareTo(prathmesh));//-3

}
}