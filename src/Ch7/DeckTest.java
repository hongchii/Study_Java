package Ch7;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 객체 생성
		Card c = d.pick(0); // 섞기 전 0번째 카드 뽑기
		System.out.println(c); // 카드 출력

		d.shuffle(); // 카드 섞기
		c = d.pick(0); // 섞은 후 0번째 카드 뽑기
		System.out.println(c); // 카드 출력
	}

}
