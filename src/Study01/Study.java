package Study01;

import java.util.Scanner;

public class Study {
	 String name; // 멤버이름
	 int deposit; // 보증금
	 int fine; // 벌금
	 int balance; // 잔액
	 String ch; // 챕터 수행여부
	 String task; // 과제 수행여부 
	 String chk1; // 중간점검 참석여부
	 String chk2; // 마지막점검 참석여부
	 
	 public void input() {
	 
		 Scanner scan = new Scanner(System.in);
	
		 System.out.print("이름 : ");
		 name = scan.nextLine();
		 System.out.println("보증금 : ");
		 deposit = scan.nextInt();
		 System.out.println("벌금 : ");
		 fine = scan.nextInt();
		 System.out.println("잔액 : ");
		 balance = scan.nextInt();
		 System.out.println("챕터 수행여부 : ");
		 ch = scan.nextLine();
		 System.out.println("과제 수행여부 : ");
		 task = scan.nextLine();
		 System.out.println("중간점검 참석여부 : ");
		 chk1 = scan.nextLine();
		 System.out.println("마지막점검 참석여부 : ");
		 chk2 = scan.nextLine();
	 
	 }
	 
	 public void output() {
		 System.out.println("======================");
		 System.out.println("        벌금 내역       ");
		 System.out.println("======================");
		 System.out.println("    이름       벌금     ");
		 System.out.println("----------------------");
		 System.out.println();
	 }
}
