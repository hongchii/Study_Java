package CafeOrderProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
        
		OrderServiceImpl order = new OrderServiceImpl();
		ArrayList list = new ArrayList();
		ArrayList<ChoiceVO> choice = new ArrayList();
		int menu;
		
		while(true) {
			
			menu();
			
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1 :
				//setOrder(choice);
				System.out.print("아메리카노");
				System.out.print("1.ice 2.hot 선택 (주문취소 c) :");
				
				break;
			case 2 :
				
				break;
			case 3 :
				
				break;
			case 4 :
				
				break;
			case 5 :
				
				break;
			case 6 :
				
				break;
			default:
				
			}
			
		}
		
	} // main end
	
	static void menu() {
		System.out.println("메뉴");
		System.out.println("1.아메리카노 1000원");
		System.out.println("2.바닐라라떼 2500원");
		System.out.println("3.레몬에이드 3000원");
		System.out.println("4.자몽에이드 3000원");
		System.out.println("5.수박주스  4000원");
		System.out.println("6.토마토주스 4000원");
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("음료를 선택해주세요 : ");
		
	}

	static void setOrder(ArrayList choice) {
		System.out.print("아메리카노");
		System.out.print("1.ice 2.hot 선택 (주문취소 c) :");
		
		
	}
}
