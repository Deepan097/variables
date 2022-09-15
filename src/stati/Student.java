package stati;

import java.util.LinkedHashSet;
import java.util.Set;

class Student {
	String name;
	int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Kamal", 001);
		Student s2 = new Student("K1", 002);
		Student s3 = new Student("K2", 003);
		Student s4 = new Student("K2", 003);

		Set<Student> class12 = new LinkedHashSet<Student>();
		class12.add(s1);
		class12.add(s2);
		class12.add(s3);
		class12.add(s4);

		for (Student stu : class12) {
			System.out.println("name :" + stu.name + "\trollNo :" + stu.rollNo);

		}
	}
}