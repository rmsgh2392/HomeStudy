import java.util.Scanner;

public class Ex07 {
	public static void main(String[]args) {
		int i = 0;
		System.out.print("숫자하나를 입력하세요.:");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		//문자열 변수 tmp에 사용자가 입력한 값이 들어온다
		//예) 15 - > "15"
		int input =Integer.parseInt(tmp);
		//문자열 변수 tmp을 정수형 타입으로 바꿔 정수형타입
		//input에 저장 
		
		if(i==0) {
			System.out.println("입력하신 숫자는 0입니다");
		}//처음에 초기화했던 i의 값이 조건식을 만나 맞으면{}블록 실행
		if(input !=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 "+input+"입니다.");
		}//정수형 타입으로 저장된 input변수가 조건식이
		 //맞으면 {}블록 실행 
		
				
		
	}

}
