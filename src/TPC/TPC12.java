package TPC;

public class TPC12 {

	public static void main(String[] args) {
		// 책(Object) -> 생성+초기화 -> 중복정의
		BookVO b1 = new BookVO();
		
		System.out.println(b1.title+"\t");
		System.out.println(b1.price+"\t");
		System.out.println(b1.company+"\t");
		System.out.println(b1.page);
	}

}
