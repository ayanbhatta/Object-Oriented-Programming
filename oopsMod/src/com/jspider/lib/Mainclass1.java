package com.jspider.lib;
class Parent{
	int x=100;
	void feature() {
		System.out.println("task-1");
		System.out.println("task-2");
		System.out.println("task-3");
	}
}
class Child extends Parent{
	int x=200;
	@Override
	void feature() {
		super.feature();
		System.out.println("task-4");
		System.out.println("task-5");
	}
	void play() {
		int x = 300;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ref = new Child();
				ref.play();
				ref.feature();
	}

}
