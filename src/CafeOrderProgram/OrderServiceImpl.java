package CafeOrderProgram;

import java.util.Scanner;

public class OrderServiceImpl implements OrderService {

	MenuVO menu = new MenuVO();
	MenuPriceVO price = new MenuPriceVO();
	Scanner scan = new Scanner(System.in);
	static int totPrice = 0;

	@Override
	public void setOrderAmericano(MenuVO menu) {
		menu.setCoffee("아메리카노");
		price.setCoffeePrice(1000);
		totPrice += 1000;
		System.out.println(menu.getCoffee());
		setOption(menu);
	}

	@Override
	public void setOrderVanillaLatte(MenuVO menu) {
		menu.setCoffee("바닐라라떼");
		price.setCoffeePrice(2500);
		totPrice += 2500;
		System.out.println(menu.getCoffee());
		setOption(menu);
	}

	@Override
	public void setOrderLemonAde(MenuVO menu) {
		menu.setCoffee("레몬에이드");
		price.setCoffeePrice(3000);
		totPrice += 3000;
		System.out.println(menu.getCoffee());
		setOption(menu);
	}

	@Override
	public void setOrderGrapeFruitAde(MenuVO menu) {
		menu.setCoffee("자몽에이드");
		price.setCoffeePrice(3000);
		totPrice += 3000;
		System.out.println(menu.getCoffee());
		setOption(menu);
	}

	@Override
	public void setOrderWaterMelonJuice(MenuVO menu) {
		menu.setCoffee("수박주스");
		price.setCoffeePrice(4000);
		totPrice += 4000;
		System.out.println(menu.getCoffee());
		setOption(menu);
	}

	@Override
	public void setOrderTomatoJuice(MenuVO menu) {
		menu.setCoffee("토마토주스");
		price.setCoffeePrice(4000);
		totPrice += 4000;
		System.out.println(menu.getCoffee());
		setOption(menu);
	}

	@Override
	public void setOption(MenuVO menu) {

		String orderCancel;

		if (menu.getCoffee().equals("아메리카노") || menu.getCoffee().equals("바닐라라떼")) {

			System.out.println();
			System.out.print("1.ice 2.hot 선택 (주문취소 c) :");
			String iceOrHot = scan.nextLine();

			if (Integer.parseInt(iceOrHot) == 1) {
				menu.setIceOrHot("ice");
				price.setIceOrHotPrice(0);
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + ")");
			} else if (Integer.parseInt(iceOrHot) == 2) {
				menu.setIceOrHot("hot");
				price.setIceOrHotPrice(0);
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + ")");
			} else if (iceOrHot == "c") {
				System.out.print("주문을 취소하시겠습니까? (y/n) : ");
				orderCancel = scan.nextLine();

				if (orderCancel.equals("y")) {

				} else {

				}

			}

			System.out.println();
			System.out.print("1.1샷(0원) 2.2샷(+500원) 선택 (주문취소 c) : ");
			String shot = scan.nextLine();

			if (Integer.parseInt(shot) == 1) {
				menu.setShot("1샷");
				price.setShotPrice(0);
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + ")");
			} else if (Integer.parseInt(shot) == 2) {
				menu.setShot("2샷");
				price.setShotPrice(500);
				totPrice += 500;
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + ")");
			} else if (shot == "c") {
				System.out.println("주문취소");

			}

			System.out.println();
			System.out.print("1.S(+0원) 2.M(+500원) 3.L(+1000원) 선택 (주문취소 c) : ");
			String size = scan.nextLine();

			if (Integer.parseInt(size) == 1) {
				menu.setSize("S");
				price.setSizePrice(0);
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + "/"
						+ menu.getSize() + ")");
			} else if (Integer.parseInt(size) == 2) {
				menu.setSize("M");
				price.setSizePrice(500);
				totPrice += 500;
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + "/"
						+ menu.getSize() + ")");
			} else if (Integer.parseInt(size) == 3) {
				menu.setSize("L");
				price.setSizePrice(1000);
				totPrice += 1000;
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + "/"
						+ menu.getSize() + ")");
			} else if (size == "c") {
				System.out.println("주문취소");
			}

			System.out.println();
			System.out.print("1.매장이용(+500원) 2.테이크아웃 선택 (주문취소 c) : ");
			String takeoutYn = scan.nextLine();

			if (Integer.parseInt(takeoutYn) == 1) {
				menu.setTakeoutYn("매장이용");
				price.setTakeoutYnPrice(500);
				totPrice += 500;
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + "/"
						+ menu.getSize() + "/" + menu.getTakeoutYn() + ")");
			} else if (Integer.parseInt(takeoutYn) == 2) {
				menu.setTakeoutYn("테이크아웃");
				price.setTakeoutYnPrice(0);
				System.out.println(menu.getCoffee() + "(" + menu.getIceOrHot() + "/" + menu.getShot() + "/"
						+ menu.getSize() + "/" + menu.getTakeoutYn() + ")");
			} else if (takeoutYn == "c") {
				System.out.println("주문취소");

			}
		} else {

			System.out.println();
			System.out.print("1.S(+0원) 2.M(+500원) 3.L(+1000원) 선택 (주문취소 c) : ");
			String size = scan.nextLine();

			if (Integer.parseInt(size) == 1) {
				menu.setSize("S");
				System.out.println(menu.getCoffee() + "(" + menu.getSize() + ")");
			} else if (Integer.parseInt(size) == 2) {
				menu.setSize("M");
				price.setSizePrice(500);
				totPrice += 500;
				System.out.println(menu.getCoffee() + "(" + menu.getSize() + ")");
			} else if (Integer.parseInt(size) == 3) {
				menu.setSize("L");
				price.setSizePrice(1000);
				totPrice += 1000;
				System.out.println(menu.getCoffee() + "(" + menu.getSize() + ")");
			} else if (size == "c") {
				System.out.println("주문취소");
			}

			System.out.println();
			System.out.print("1.매장이용(+500원) 2.테이크아웃 선택 (주문취소 c) : ");
			String takeoutYn = scan.nextLine();

			if (Integer.parseInt(takeoutYn) == 1) {
				menu.setTakeoutYn("매장이용");
				price.setTakeoutYnPrice(500);
				totPrice += 500;
				System.out.println(menu.getCoffee() + "(" + menu.getSize() + "/" + menu.getTakeoutYn() + ")");
			} else if (Integer.parseInt(takeoutYn) == 2) {
				menu.setTakeoutYn("테이크아웃");
				price.setTakeoutYnPrice(0);
				System.out.println(menu.getCoffee() + "(" + menu.getSize() + "/" + menu.getTakeoutYn() + ")");
			} else if (takeoutYn == "c") {
				System.out.println("주문취소");

			}
		}
	}

	@Override
	public void getOrder() {

	}
}
