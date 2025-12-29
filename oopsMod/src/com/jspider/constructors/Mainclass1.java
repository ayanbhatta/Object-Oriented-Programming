package com.jspider.constructors;
class Container{
	int capacity;
	Container(){
		capacity=500;
	}
	Container(int arg){
		capacity=arg;
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		Container c1=new Container();
		System.out.println(c1.capacity);
		Container c2=new Container(1000);
		System.out.println(c2.capacity);

	}

}
