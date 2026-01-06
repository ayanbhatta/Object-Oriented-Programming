package com.jspider.typecasting;

public class Manager {
	static void review(SDE s) {
		if(s!=null) {
			s.meeting();
			if(s instanceof Dev) {
				Dev d = (Dev) s;
				d.coding();
			}
			else if(s instanceof Tester) {
				Tester t = (Tester) s;
				t.testing();
			}
		}
	}
}
