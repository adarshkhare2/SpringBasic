package BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class MyBean implements InitializingBean, DisposableBean //InitializingBean,DisposableBean imterface use for 
{
	private int x;
	private String y;
	private String z;
	
	public MyBean() {
		System.out.println("MyBean:--MyBean() constructor obj getting created");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("MyBean.setX()");
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
		System.out.println("MyBean.setY()");
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
		System.out.println("MyBean.setZ()");
	}

	public void showMsg() {
		System.out.println("MyBean:-showMsg()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBean:--afterPropertiesSet()  from InitializingBean");
	}

	public void destroy() throws Exception {
		System.out.println("MyBean:--destroy() from DisposableBean");
	}
}
