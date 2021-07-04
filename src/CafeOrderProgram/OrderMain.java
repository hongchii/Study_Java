package CafeOrderProgram;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {

		OrderServiceImpl order = new OrderServiceImpl();
		MenuVO menu = new MenuVO();
		int orderMenu;

		while (true) {

			Scanner scan = new Scanner(System.in);
			orderMenu();

			orderMenu = scan.nextInt();
			System.out.println();

			switch (orderMenu) {
			case 1:
				order.setOrderAmericano(menu);
				addOrder(menu);
				break;
			case 2:
				order.setOrderVanillaLatte(menu);
				addOrder(menu);
				break;
			case 3:
				order.setOrderLemonAde(menu);
				addOrder(menu);
				break;
			case 4:
				order.setOrderGrapeFruitAde(menu);
				addOrder(menu);
				break;
			case 5:
				order.setOrderWaterMelonJuice(menu);
				addOrder(menu);
				break;
			case 6:
				order.setOrderTomatoJuice(menu);
				addOrder(menu);
				break;
			default:

			}

		}

	} // main end

	static void orderMenu() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1.아메리카노 1000원");
		System.out.println("2.바닐라라떼 2500원");
		System.out.println("3.레몬에이드 3000원");
		System.out.println("4.자몽에이드 3000원");
		System.out.println("5.수박주스  4000원");
		System.out.println("6.토마토주스 4000원");
		System.out.println("----------------");
		System.out.println();
		System.out.print("음료를 선택해주세요 : ");

	}

	static void addOrder(MenuVO menu) {
		System.out.println();
		System.out.println("추가주문확인");
		System.out.print("추가주문하시겠습니까?(y/n)");

		Scanner scan = new Scanner(System.in);
		String addOrder;
		String orderChk;
		
		addOrder = scan.nextLine();

		if (addOrder.equals("y")) {

		} else if (addOrder.equals("n")) {
			System.out.print(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + "/"
					+ menu.getSize() + "/" + menu.getTakeoutYn() + ") 를 주문하시겠습니까?(y/n)");
			orderChk = scan.nextLine();
			
			if (orderChk.equals("y")) {
				order(menu);
			}else if(orderChk.equals("n")){
				
			}
			
			
		}

	}
	
	static void order(MenuVO menu) {
		
		System.out.println("주문완료");
		System.out.println("=============================");
		System.out.println("     대기번호 : ");
		System.out.println("============결제내역===========");
		System.out.println("품목           수량         금액");
		System.out.println("-----------------------------");
		System.out.printf("%5s, %4d", menu.getCoffee());
		System.out.println("추가 " + menu.getIceOrHot());
		System.out.println("추가 " + menu.getShot());
		System.out.println("추가 " + menu.getSize());
		System.out.println("추가 " + menu.getTakeoutYn());
		System.out.println("----------------------------");
		System.out.println("합계                      "+ OrderServiceImpl.totPrice);
		System.out.println("============================");
		
	}
}
