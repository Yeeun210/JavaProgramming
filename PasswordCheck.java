import java.util.Scanner;

public class check {
	
	//숫자의 개수 확인
	public static int CheckNum(String password) {
		int length = password.length();
		int Nnum=0;
		for(int i=0 ; i< length ;i++) {
			if(48<=password.charAt(i) && password.charAt(i)<=57) {
				Nnum++;
			}
		}
		return Nnum;
	}
	
	//문자의 개수 확인
	public static int CheckWord(String password) {
		int length = password.length();
		int Wnum=0;
		for(int i=0 ; i< length ;i++) {
			if((65<=password.charAt(i) && password.charAt(i)<=90)||
					(97<=password.charAt(i) && password.charAt(i)<=122)) {
				Wnum++;
			}
		}
		return Wnum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password;
		
		//1.문자열을 입력받는다
		System.out.print("암호를 입력하세요: ");
		password=scan.nextLine();
		
		int Nnum = CheckNum(password);
		int Wnum = CheckWord(password);
		
		//2. 길이가 10이상이고 영문자와 숫자가 포함되어 있는지 확인한다.
		if(password.length()>=10 && Nnum>0 && Wnum>0) {
			System.out.println("암호가 유효하다.");
		}else {
			System.out.println("암호가 유효하지 않다.");
			//길이가 10이상인지
			if(password.length()<10) {
				System.out.println("이유: 암호의 길이가 10보다 작다.");
			}
			//숫자가 포함되어 있는지
			if(Nnum == 0) {
				System.out.println("이유: 암호 내에 숫자가 없다.");
			}
			//영문자가 포함되어 있는지
			if(Wnum == 0) {
				System.out.println("이유: 암호 내에 영문자가 없다.");
			}
		}
	}

}