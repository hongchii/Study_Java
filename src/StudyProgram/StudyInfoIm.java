package StudyProgram;

import java.util.Scanner;

public class StudyInfoIm implements StudyInfo {

	Scanner scan = new Scanner(System.in);

	static int cnt = 0;
	static String deleteMem = "del";

	@Override
	public void joinStudy(StudyVO[] std) {

		System.out.println(">>가입<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();

		if (cnt > 0) {
			for (int i = 0; i < cnt; i++) {

				if (std[i].getMemberCode().equals(memberCode)) {
					System.out.println("중복회원!!!!");
					return;
				}
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

		cnt++;
		System.out.println(">>>가입완료.");
		System.out.println();
	}

	@Override
	public void inputStudy(StudyVO[] std) {

		System.out.println(">>정보입력<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();

		if (cnt > 0) {
			for (int i = 0; i <= cnt; i++) {

				if (std[i].getMemberCode().equals(memberCode)) {

					System.out.println("회원번호 : " + std[i].getMemberCode());

					System.out.print("스터디날짜 : ");
					String studyDate = scan.nextLine();
					std[i].setStudyDate(studyDate);

					System.out.print("챕터정리 : ");
					String chapter = scan.nextLine();
					std[i].setChapter(chapter);

					System.out.print("과제 :");
					String task = scan.nextLine();
					std[i].setTask(task);

					System.out.print("중간점검 :");
					String chk1 = scan.nextLine();
					std[i].setChk1(chk1);

					System.out.print("최종점검 :");
					String chk2 = scan.nextLine();
					std[i].setChk2(chk2);
					System.out.println();
					return;

				} 

			}
		} else {
			System.out.println();
			System.out.println("가입을 먼저해주세요.");
			System.out.println();
		}

	}

	@Override
	public void updateStudy(StudyVO[] std) {

		System.out.println(">>정보수정<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();

		if (cnt > 0) {
			for (int i = 0; i <= cnt; i++) {

				if (std[i].getMemberCode().equals(memberCode)) {

					System.out.println("회원번호 : " + std[i].getMemberCode());

					System.out.print("스터디날짜 : ");
					String studyDate = scan.nextLine();
					std[i].setStudyDate(studyDate);

					System.out.print("챕터정리 : ");
					String chapter = scan.nextLine();
					std[i].setChapter(chapter);

					System.out.print("과제 :");
					String task = scan.nextLine();
					std[i].setTask(task);

					System.out.print("중간점검 :");
					String chk1 = scan.nextLine();
					std[i].setChk1(chk1);

					System.out.print("최종점검 :");
					String chk2 = scan.nextLine();
					std[i].setChk2(chk2);
					System.out.println();
					return;

				}

			}
		} else {
			System.out.println();
			System.out.println("가입을 먼저해주세요.\n");
		}
	}

	public void fineChk(StudyVO[] std) {

		String x = "x";
		int fine = 2500;
		int totFine = 0;

		if (cnt > 0) {
			for (int i = 0; i < cnt; i++) {

				if (x.equals(std[i].getChapter())) {
					totFine += fine;
				}

				if (x.equals(std[i].getTask())) {
					totFine += fine;
				}

				if (x.equals(std[i].getChk1())) {
					totFine += fine;
				}

				if (x.equals(std[i].getChk2())) {
					totFine += fine;
				}

				std[i].setFine(totFine);
				std[i].setBalance(std[i].getDeposit() - std[i].getFine());
				totFine = 0;
			}

		}

	}

	@Override
	public void deleteStudy(StudyVO[] std) {

		System.out.println(">>탈퇴<<");
		System.out.print("회원번호 : ");
		String memberCode = scan.nextLine();

		if (cnt > 0) {
			for (int i = 0; i < cnt; i++) {

				if (std[i].getMemberCode().equals(memberCode)) {
					std[i].setMemberCode(deleteMem);
				}
			}
		}
	}

	@Override
	public void outputFine(StudyVO[] std) {
		for (int i = 0; i < cnt; i++) {
			if (std[i].getFine() == 0) {

			} else {
				System.out.printf("%4s  %5s  %7s  %5d", std[i].getMemberCode(), std[i].getMemberName(),
						std[i].getStudyDate(), std[i].getFine());
				System.out.println("\n-------------------------------");

			}
		}
	}

	@Override
	public void outputStudy(StudyVO[] std) {
		for (int i = 0; i < cnt; i++) {
			if (deleteMem.equals(std[i].getMemberCode())) {

			} else {
				System.out.printf("%5s  %5s  %6d  %6s  %6s  %6s  %6s  %6s   %5d %5d", std[i].getMemberCode(),
						std[i].getMemberName(), std[i].getDeposit(), std[i].getStudyDate(), std[i].getChapter(),
						std[i].getTask(), std[i].getChk1(), std[i].getChk2(), std[i].getFine(), std[i].getBalance());
				System.out.println("\n----------------------------------------------------------------------------");
			}
		}

	}

}
