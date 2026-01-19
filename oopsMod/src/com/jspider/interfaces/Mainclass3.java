package com.jspider.interfaces;

public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SourceCode sc = new SourceCode();
		CodeManager.readCode(sc);
		System.out.println("-----------------------");
		ByteCode bc = new ByteCode();
		CodeManager.readCode(bc);
	}

}
