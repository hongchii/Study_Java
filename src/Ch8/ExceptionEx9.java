package Ch8;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴!");
			throw e;
			// throw new Exception("고의로 발생시킴!"); - 위의 두줄을 한줄
		} catch (Exception e) {
			System.out.println("에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
