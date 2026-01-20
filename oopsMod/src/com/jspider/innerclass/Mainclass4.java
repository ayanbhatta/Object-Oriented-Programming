package com.jspider.innerclass;
interface Helper{
	void help();
	void clean();
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helper ref = new Helper() {//ANYNOMUS INNER CLASS

			@Override
			public void help() {
				// TODO Auto-generated method stub
				System.out.println("Executing help");
			}

			@Override
			public void clean() {
				// TODO Auto-generated method stub
				System.out.println("Executing clean");
			}	
			
		};
		ref.help();
		ref.clean();
	}

}
