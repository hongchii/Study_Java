package Ch8;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i < 10; i++) {
			result = number / (int)(Math.random() * 10); 
			System.out.println(result);
		}
	}

}
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Ch8.ExceptionEx2.main(ExceptionEx2.java:10)
	
	0으로 나누려고 했기 때문에 'ArithmeticException'이 발생했고, 위치는 10번째 라인이란걸 알 수 있다.
 * 
 */
