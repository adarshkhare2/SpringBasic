package spapp2;

import org.springframework.stereotype.Component;

@Component
//depencency in form of object
public class MyBean2 // outer bean
{
	public MyBean1 myBean1;// inner bean
	// setter

	public void showMsg() {
		System.out.println("MyBean2:- showMsg()");
		myBean1.showMsg1();
	}

	public void setMyBean1(MyBean1 myBean1) {
		this.myBean1 = myBean1;
	}

}
