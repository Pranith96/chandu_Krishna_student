
public class Student {

	private Integer studentId;
	private String studentName;
	private String collegeName;
	private String age;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Student(Integer studentId, String studentName, String collegeName, String age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeName = collegeName;
		this.age = age;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeName=" + collegeName
				+ ", age=" + age + "]";
	}

}
