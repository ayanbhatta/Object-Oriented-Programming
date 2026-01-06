package com.jspider.typecasting;
class Alpha{
	void test() {
		System.out.println("test()...");
	}
}
class Beta extends Alpha{
	void run() {
		System.out.println("run()...");
	}
}
public class Mainclass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new Beta();
		a.test();
		Beta b = (Beta) a;
		b.test();
		b.run();
		
	}

}
