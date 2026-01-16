package com.jspider.partialabstraction;
abstract class Delta{
	void run() {
		System.out.println("run...");
	}
	void start() {
		System.out.println("star...");
	}
}
class Example extends Delta{
	
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delta ref = new Example();
	}

}
