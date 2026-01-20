package com.jspider.innerclass;
class Demo{
	static class Sample{
		void test() {
			System.out.println("executing test...");
		}
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.Sample ref = new Demo.Sample();
		ref.test();
	}

}
