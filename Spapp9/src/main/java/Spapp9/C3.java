package Spapp9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class C3 {
	C2 c2;

	public C2 getC2() {
		return c2;
	}
	@Autowired
	public void setC2(C2 c2) {
		this.c2 = c2;
	}

	public int job1() {
		return c2.work1();
	}

	public int job2() {
		return c2.work2();
	}
}
