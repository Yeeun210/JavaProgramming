import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String info; //정보
		String name; //이름
		String number; //학번
		String department; //학과
		int index; //지수

		//1. 이름, 학번, 학과 입력 받기
		System.out.print("이름, 학번과 학과를 입력하세요: ");
		info = scan.next();
		
		//2. 이름 추출
		index = info.indexOf("/");
		name = info.substring(0,index);
		info = info.substring(index+1);
		
		//3. 학번 추출
		index = info.indexOf("/");
		number = info.substring(0,index);
		info = info.substring(index+1);
		
		//4. 학과 추출
		department = info;
		
		//5. 출력
		System.out.println("이름: "+ name);
		System.out.println("학번: "+ number);
		System.out.println("학과: "+department);
	}

}
