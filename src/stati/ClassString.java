package stati;

public class ClassString {
	
	
	public static void main(String[] args) {
		
		  String st1 = "Tutorials";
	      String st2 = "Point";
	      String st3 = "Point";

	      System.out.println("The hascode of st1 = " + st1.hashCode());
	      System.out.println("The hascode of st2 = " + st2.hashCode());
	      System.out.println("The hascode of st3 = " + st3.hashCode());

	      st1 = st1 + st2;
	      System.out.println("The Hashcode after st1 is changed : "+ st1.hashCode());
	      
	      
	      
	      String str3 = new String("juice");
	      String str4 = new String("Point");
	      
	      System.out.println("The hascode of st3 = " + str3.hashCode());
	      System.out.println("The hascode of st4 = " + str4.hashCode());
	      String str5 = str3 + str4;
	      System.out.println("The Hashcode after st5 is changed : "+ str5.hashCode());
	      
	      
	      

	}
}
