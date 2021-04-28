package TPC;

public class Cat extends Animal {
	public void night() {
		System.out.println("밤에 눈에서 빛이난다.");
	}
	
	@Override
	public void eat() {
		System.out.println("고양이 처럼 먹다.");
	}
}
