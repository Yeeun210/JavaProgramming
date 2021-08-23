
public class Student {
	
	//객체 변수들
	private String name; //이름
	private String StudentID; //학번
	private String department; //소속학과
	
	//접근자 메소드
	
	//학생 이름 반환
	public String getName() {
		return name;
	}
	
	//학생 학번 반환
	public String getStudentID() {
		return StudentID;
	}
	
	//학생 소속학과 반환
	public String getDepartment() {
		return department;
	}
	
	//현 Student 객체의 정보에 대한 문자열을 반환한다
	public String toString() {
		String str = "";
		str += "이름: "+name+"\n";
		str += "학번: "+StudentID+"\n";
		str += "소속학과: "+department+"\n";
		return str;
	}

	//변경자 메소드
	
	//이름을 주어진 값으로 변경
	public void setName(String Name) {
		name = Name;
	}
	
	//학번을 주어진 값으로 변경
	public void setStudentID(String ID) {
		StudentID = ID;
	}
	
	//소속학과를 주어진 값으로 변경
	public void setDepartment(String Department) {
		department =Department;
	}
}
