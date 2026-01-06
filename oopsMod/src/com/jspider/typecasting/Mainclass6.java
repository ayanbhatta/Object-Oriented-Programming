package com.jspider.typecasting;
//DOWNCASTING
class Demos{
	
}
class Samples extends Demos{
	
}
public class Mainclass6 {
	public static void main(String[] args) {
		Demos d = new Samples();
		Samples s = (Samples)d;	//same object(Only 1 object created)
		System.out.println(d);
		System.out.println();
		
	}
}
