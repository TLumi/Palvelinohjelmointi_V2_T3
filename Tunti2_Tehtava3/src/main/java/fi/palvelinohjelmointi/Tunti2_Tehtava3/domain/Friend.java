package fi.palvelinohjelmointi.Tunti2_Tehtava3.domain;

import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class Friend {
	
	@Size(min=3,max=50)
	private String name;

		
	public Friend() {
		super();
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	
}
	
	
	
