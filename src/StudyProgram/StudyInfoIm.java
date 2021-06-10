package StudyProgram;

import java.util.Scanner;

public class StudyInfoIm implements StudyInfo {
	
	
	Scanner scan = new Scanner(System.in);
	
	static int cnt =0;
	static int memCnt = 0;
	
	@Override
	public void joinStudy(StudyVO[] std) {
		
		System.out.println(">>가입<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();
		if (cnt > 0) {
			if(std[cnt-1].getMemberCode().equals(memberCode)) {
				System.out.println("중복회원!!!!");
				return;
			}
		}
		std[cnt].setMemberCode(memberCode);	
		
		System.out.print("회원이름 : ");
		String memberName = scan.nextLine();
		std[cnt].setMemberName(memberName);
		
		System.out.print("보증금 : ");
		int deposit = scan.nextInt();
		std[cnt].setDeposit(deposit);
		scan.nextLine();
		
		System.out.print("가입날짜 : ");
		String joinDate = scan.nextLine();
		std[cnt].setJoinDate(joinDate);

	}
	
	@Override
	public void inputStudy(StudyVO[] std) {	
		
		System.out.println(">>정보입력<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();
		
		memberChk(std, memberCode);
		/*
		if(std[cnt-1].getMemberCode().equals(memberCode)) {
			System.out.println("회원이름 : "+ std[cnt-1].getMemberName());
		} else {
			System.out.println();
			System.out.println(">>>없는 회원입니다.");
			System.out.println();
			return;
		}
		*/
		System.out.print("챕터정리 : ");
		String chapter = scan.nextLine();
		std[cnt-1].setChapter(chapter);
		
		System.out.print("과제 :");
		String task = scan.nextLine();
		std[cnt-1].setTask(task);
		
		System.out.print("중간점검 :");
		String chk1 = scan.nextLine();
		std[cnt-1].setChk1(chk1);
		
		System.out.print("최종점검 :");
		String chk2 = scan.nextLine();
		std[cnt-1].setChk2(chk2);
		System.out.println();
	}
	
	@Override
	public void updateStudy(StudyVO[] std) {
		
		System.out.println(">>정보수정<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();
		
		memberChk(std, memberCode);
				
		System.out.print("챕터정리 : ");
		String chapter = scan.nextLine();
		std[cnt-1].setChapter(chapter);
		
		System.out.print("과제 :");
		String task = scan.nextLine();
		std[cnt-1].setTask(task);
		
		System.out.print("중간점검 :");
		String chk1 = scan.nextLine();
		std[cnt-1].setChk1(chk1);
		
		System.out.print("최종점검 :");
		String chk2 = scan.nextLine();
		std[cnt-1].setChk2(chk2);
		System.out.println();
	}
	
	public void memberChk(StudyVO[] std, String memberCode) {
	
		
		if(std[cnt-1].getMemberCode().equals(memberCode)) {
			System.out.println("회원이름 : "+ std[cnt-1].getMemberName());
		
			
		} else {
			System.out.println();
			System.out.println(">>>없는 회원입니다.");
			System.out.println();
			
			return;
		}
		
	}
	
	
	@Override
	public void processStudy() {
		
	}

	@Override
	public void outputStudy() {
		
	}

	@Override
	public void outputDeposit(StudyVO[] std) {
		
		System.out.println("===============================");
		System.out.println("            벌금내역");
		System.out.println("===============================");
		System.out.println("회원번호 | 회원이름 | 스터디날짜 | 벌금");
		System.out.println("-------------------------------");
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%3d, %3d, %5d, %5s", std[i].getMemberCode(), std[i].getMemberName(), std[i].getStudyDate(), std[i].getDeposit());
			System.out.println("-------------------------------");
		}
	}
	
	
}
