package StudyProgram;

import java.util.Scanner;

public class StudyMain {
	final static int SIZE = 100;

	public static void main(String[] args) {
		
		StudyInfoIm info = new StudyInfoIm();
		StudyVO std[] = new StudyVO[SIZE];
		
		//static int memCnt = 0;
		
		int menu;
		
		while(true) {
			
			menu();
			
			Scanner scan = new Scanner(System.in);

			System.out.print("메뉴 선택 :");
			menu = scan.nextInt();
			System.out.println();
			
			switch (menu) {
			case 1:
				join(info, std);		
				break;
			case 2:
				input(info, std);
				break;
			case 3:
				update(info, std);
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!!!\n");
			}
		}
		
		
		
		
		
	}
	
	static void menu() {
		System.out.println("메뉴");
		System.out.println(" 1.스터디가입");
		System.out.println(" 2.정보입력");
		System.out.println(" 3.정보수정");
		System.out.println(" 4.스터디탈퇴");
		System.out.println(" 5.벌금현황");
		System.out.println(" 6.스터디현황");
		System.out.println(" 7.종료");
		System.out.println();
	}
	
	static void join(StudyInfoIm info, StudyVO[] std) {
		std[info.cnt] = new StudyVO();
		info.joinStudy(std);
		info.cnt++;
		System.out.println();
		System.out.println(">>>가입완료.");
		System.out.println();
	}
	
	static void input(StudyInfoIm info, StudyVO[] std) {
		info.inputStudy(std);
	}
	 
	static void update(StudyInfoIm info, StudyVO[] std) {
		info.updateStudy(std);
	}
	
	static void outputDeposit(StudyInfoIm info, StudyVO[] std) {
		info.outputDeposit(std);
	}
	
}
