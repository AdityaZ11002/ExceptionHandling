package OverFlowExecption;

public class RecursionDemo {

	public static void main(String[] args) {

		RecursionDemo d = new RecursionDemo();

		d.m1();
	}

	public void m1() {
		System.out.println("Recursion m1");
		m2();
	}

	public void m2() {
		System.out.println("Recursion m2");
		m1();
	}
}