package com.jspider.innerclass;
class Alpha{
	class Beta{
		void play() {
			System.out.println("playing");
		}
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha.Beta ref = new Alpha().new Beta();
		ref.play();
	}

}
