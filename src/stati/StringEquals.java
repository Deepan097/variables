package stati;

public class StringEquals {
	

	public static void main(String[] args) {
		// StringEquals s=new StringEquals();
		// s.school();
		String s1 = "deepan";
		String s2 = "deepan";
		
		System.out.println("equals"+s1.equals(s2));
		
		if(s1==s2) {
		System.out.println("==");
		}

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}

}
