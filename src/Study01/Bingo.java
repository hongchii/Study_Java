package Study01;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0, cnt = 0;
		int bcnt = 0; // 
		int tmp = 0; 
		int tmp2 = 0;
		
		int widthCnt = 0; // 가로 빙고
		int heightCnt = 0; // 세로 빙고
		int totCnt = 0; // 총 빙고

		int[][] bingo = new int[SIZE][SIZE];
		int[][] bingo2 = new int[SIZE][SIZE];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1; // 배열에 1~25 저장
			}
		}

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		if (cnt == 0) {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {

					System.out.printf("[%d,%d]", i, j);
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			}
		}

		do {
			
			if (totCnt == 1) {
				System.out.println("1빙고");
				//System.out.println("t");
			} else if (totCnt == 2) {
				System.out.println("2빙고");
				
			} else if (totCnt == 3) {
				System.out.println("3빙고");
				
			} else if (totCnt == 4) {
				System.out.println("4빙고");
				
			} else if (totCnt == 5) {
				System.out.println("5빙고");
				break;
			} 
			
			
		
			System.out.println();
			
			System.out.print("숫자입력(종료:0)->");
			num = scan.nextInt();

			
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {

					if (bingo[i][j] == num) { // 입력 숫자와 빙고판 숫자 비교
						
						bingo2[i][j] = bingo[i][j]; // 같으면 bingo2에 값 저장
						cnt++;
						System.out.println("cnt체크" + cnt);
						
						for (x = 0; x < SIZE; x++) { // bingo2 값 체크를 위한 for문
							for (y = 0; y < SIZE; y++) {
								
								if (bingo2[x][y] != 0) { // bingo2에 저장된 값 모두 출력하기 위한 if문

									if (cnt >= 5) {
										for (int z = 0; z < SIZE; z++) {

											// 가로 줄 빙고 체크 
											//System.out.println("tot" + totCnt);
											if (bingo2[0][z] != 0 || bingo2[z][0] != 0) {
												bcnt++;
												
												if (bcnt % 5 == 0) {
													totCnt++;
													
												}
											} else if (bingo2[1][z] != 0 || bingo2[z][0] != 0) {
												bcnt++;

												if (bcnt == 5) {
													totCnt++;
													
												}
											} else if (bingo2[2][z] != 0 || bingo2[z][0] != 0) {
												bcnt++;

												if (bcnt == 5) {
													totCnt++;
													
												}
											} else if (bingo2[3][z] != 0 || bingo2[z][0] != 0) {
												bcnt++;

												if (bcnt == 5) {
													totCnt++;
													
												}
											} else if (bingo2[4][z] != 0 || bingo2[z][0] != 0) {
												bcnt++;

												if (bcnt == 5) {
													totCnt++;
													
												}
											}

											// 세로 줄 빙고 체크 
											/*
											if (bingo2[z][0] != 0) {
												bcnt++;

												if (bcnt == 5) {
													heightCnt++;
												}
											} else if (bingo2[z][1] != 0) {
												bcnt++;

												if (bcnt == 5) {
													heightCnt++;
												}
											} else if (bingo2[z][2] != 0) {
												bcnt++;

												if (bcnt == 5) {
													heightCnt++;

												}
											} else if (bingo2[z][3] != 0) {
												bcnt++;

												if (bcnt == 5) {
													heightCnt++;
												}
											} else if (bingo2[z][4] != 0) {
												bcnt++;

												if (bcnt == 5) {
													heightCnt++;

												}
											}
											*/
										
											
										} // for문 z end
									}

									System.out.printf("%4d ", bingo2[x][y]);
						
								} else {
									System.out.printf("[%d,%d]", x, y); // 0인 것들 좌표 출력
								}
							}
							
							System.out.println();
						}

					}

				}

			}

		} while (num != 0);
		scan.close();
		System.out.println("빙고 종료");
	}

}
