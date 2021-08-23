import java.util.Scanner;

public class calculate {
	
	//while문을 사용하여 N^k 계산
	public static int CalculatePowerWhile(int N,int k) {
		int i=0;
		int answer=1;
		while(i<k) {
			answer*=N;
			i++;
		}
		return answer;
	}
	
	//For문을 사용하여 N^k 계산
	public static int CalculatePowerFor(int N,int k) {
		int answer=1;
		for(int i=0;i<k;i++) {
			answer*=N;
		}
		return answer;
	}
	
	//재귀 메소드를 사용하여 N^k 계산
	public static int CalculatePowerRecursive(int N,int k) {
		int answer=1;
		if(k==1) {
			answer=N;
		}else {
			answer=CalculatePowerRecursive(N, k-1)*N;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;//정수
		int k;//자연수
		
		System.out.print("정수 N을 입력하세요: ");
		N=scan.nextInt();
		
		//k가 0보다 작으면 다시 입력받는다.
		do{ 
			System.out.print("자연수 k를 입력하세요: ");
			k=scan.nextInt();
		}while(k<0);
		
		System.out.println("CalculatePowerWhile이라는 메소드를 이용하여 구한 값은 "+ CalculatePowerWhile(N, k)+"이다.");
		System.out.println("CalculatePowerFor이라는 메소드를 이용하여 구한 값은 "+ CalculatePowerFor(N,k)+"이다.");
		System.out.println("CalculatePowerRecursive이라는 메소드를 이용하여 구한 값은 "+ CalculatePowerRecursive(N,k)+"이다.");

	}

}