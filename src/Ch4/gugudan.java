package Ch4;

public class gugudan {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (j = 1; j <= 9; j++) {
				k = i * j;
				System.out.println(i + "x" + j + "=" + k);
			}
		}
	}

}
