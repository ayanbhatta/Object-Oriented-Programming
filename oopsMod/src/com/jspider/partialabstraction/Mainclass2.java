package com.jspider.partialabstraction;
abstract class Alpha{
	abstract void play();
	void help() {
		System.out.println("Help...");
	}
}
class Beta extends Alpha{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Play...");
	}
	
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha ref = new Beta();
		ref.play();
		ref.help();
	}

}
