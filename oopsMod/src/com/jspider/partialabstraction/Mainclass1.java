package com.jspider.partialabstraction;
abstract class Demo{
	abstract void test();
	abstract void disp();
}
class Sample extends Demo{

	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("Executing test()...");
	}

	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println("Executing disp()...");
	}
	
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ref = new Sample();
		ref.test();
		ref.disp();
	}

}
