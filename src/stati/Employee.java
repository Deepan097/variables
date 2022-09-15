package stati;

public class Employee {
	static Employee a;

	public static Employee single() {
		if (a == null) {
			a = new Employee();
		}
		return a;
	}

	public static void main(String[] args) {
		Employee single1 = single();
		Employee single2 = single();
//		if (single1.equals(single2)) {
//			System.out.println("equal");
//			System.out.println(System.identityHashCode(single1));
//		}
//		if(single1==single2) {
//			System.out.println("also equal");
//			System.out.println(System.identityHashCode(single2));
//		}
	}
}