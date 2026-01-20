package com.jspider.innerclass;
class Delta{
	void help() {
		class Example{//LOCAL INNER CLASS
			void view() {
				System.out.println("Executing view");
			}
		}
		Example ref = new Example();
		ref.view();
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delta obj = new Delta();
		obj.help();
	}

}
