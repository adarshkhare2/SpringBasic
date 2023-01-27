package Spapp9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class C2 {
	C1 c1;
	
	
	public C1 getC1() {
		return c1;
	}
	@Autowired
	public void setC1(C1 c1) {
		this.c1 = c1;
	}
	public int work1() {
		return c1.start();
	}
	public int work2() {
		return c1.start();
	}
	
}
