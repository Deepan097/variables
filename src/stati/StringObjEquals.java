package stati;

public class StringObjEquals {

	public static void main(String[] args) {
		// StringEquals s=new StringEquals();
		// s.school();
		String s1 = new String("deepan");
		String s2 = new String("deepan");
		
		System.out.println("equals"+s1.equals(s2));
		
		if(s1==s2) {
		System.out.println("==");
		}

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}


}
