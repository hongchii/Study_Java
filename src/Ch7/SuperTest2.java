package Ch7;

public class SuperTest2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	int x = 20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x" + this.x);
		System.out.println("super.x" + super.x);
		// x, this.x 는 같은 변수를 의미하고, super.x는 조상클래스에서 상속받은 변수를 의미한다.
	}
}