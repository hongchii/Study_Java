package Ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다.
		} catch (Exception e) { 
			// 모든 예외 클래스는 Exception클래스의 자손이므로, catch블럭의 괄호()안에 Exception클래스 타입의 참조변수를 선언해놓으면 어떤 종류의 예외도
			// catch블럭에 의해서 처리된다. 
			System.out.println(5);
		} // try-catch의 끝
		System.out.println(6);
	}

}
