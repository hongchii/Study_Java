package Ch8;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); // 실행되지 않는다.
		} // try-catch의 끝
		System.out.println(6);
	} // main메서드의 

}

/* 예외가 발생하지 않아서 catch블럭의 문장이 실행되지 않았다. */