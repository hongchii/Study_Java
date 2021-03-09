package TPC;

public class TPC06 {

	public static void main(String[] args) {

		int a = 67;
		int b = 98;
		int result = sum(a, b);
		System.out.println(result);

		int[] arr = makeArr();
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);

	}

	public static int sum(int a, int b) {
		int v = a + b;
		return v;
	}

	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		return arr;
	}

}
