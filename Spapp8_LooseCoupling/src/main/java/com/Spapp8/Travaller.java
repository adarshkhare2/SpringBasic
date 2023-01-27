package com.Spapp8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Travaller {

	public Vehical vehical;
	@Autowired
	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public String startJourny() {
		//System.out.println("Travaller.startJourny()");
		return vehical.move();

	}
}
