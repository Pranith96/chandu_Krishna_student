
public class EncapsulationExample {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Chandu");
		student.setCollegeName("ABC");
		student.setAge("25");
		System.out.println(student);
		System.out.println(student.getStudentName());
		System.out.println(student.getAge());

	}
}
