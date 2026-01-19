package com.jspider.interfaces;

public class CodeManager {
	static void readCode(Code c) {
		if(c!= null) {
			if( c instanceof Readable) {
				c.read();
			}
			else {
				System.out.println("Not readable format");
			}
		}
	}
}
