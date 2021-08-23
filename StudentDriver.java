
public class StudentDriver{
	public static void main(String[] args) {
		
		//첫 번째 학생
		Student stu1 = new Student();
		stu1.setName("갑돌");
		stu1.setStudentID("100");
		stu1.setDepartment("컴퓨터공학과");
		System.out.println(stu1.toString());
		
		//두 번째 학생
		Student stu2 = new Student();
		stu2.setName("갑순");
		stu2.setStudentID("200");
		stu2.setDepartment("건축학과");
		System.out.println(stu2.toString());
		
		//두 번째 학생의 학과를 변경 후 다시 출력
		stu2.setDepartment("수학과");
		System.out.println(stu2.toString());
	}
}