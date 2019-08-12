
public class Ex06 {
 public static void main(String []args) {
	 
	 int x = 0;//변수선언 정수형타입 x변수에 0값 저장(초기화)
	 System.out.printf("x = %d일떄, 참인이라고%n",x);
	 //x=%d(정수)일때 참인이라고 출력 한줄띄어주고 x값 출력
	 //%d는 정수를 나타내는 지시자 printf()메소드를 쓸 떄 지시자를 써준다.
	 //%f,%e:실수 , %n개행문자, %d,%x,%o:정수 , %c,%s:문자
	 
	 if(x==0)System.out.println("x==0");
	 //조건문 if가 조건식 x==0가 참이면 ()안 출력
	 if(x!=0)System.out.println("x!=0");
	 //조건식 'x가 0이 아니다'가 참이면 ()출력
	 if(!(x==0))System.out.println("!(x==0)");
	 //조건식 'x가 0이 아니다'가 참이면()출력
	 if(!(x!=0))System.out.println("!(x!=0)");
	 //조건식을 풀면 'x가0일떄'참이면 ()출력
	 
	 x=1;
	 System.out.printf("x = %d일때, 참인이라고%n",x);
	
	 if(x==0)System.out.println("x==0");//조건식에 초기화된 x에 1이 들어가면 거짓
	 if(x!=0)System.out.println("x!=0");//조건식 ->true
	 if(!(x==0))System.out.println("!(x==0)");//조건식->true
	 if(!(x!=0))System.out.println("!(x!=0)");//조건식->false
	 
	 
 }
}