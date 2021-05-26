package Study01;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;

		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			//System.out.printf("%2d ", bingo[i][j]);
			}
			//System.out.println();
			
		}
		
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;

			}
		}
		
		do {
			/*
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					
					System.out.printf("[%d,%d]", i, j);
					
				}
				System.out.println();
			}
			*/
			
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) 
					//bingo[i][j] = bingo[i][j];
					System.out.printf("%2d ", bingo[i][j]);	
				//System.out.printf("[%d,%d]", i, j);
				System.out.println();
			}
			System.out.println();
			
			System.out.print("숫자입력->");
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {

					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}
		} while (num != 0);


	}

}
