package model.entities;

public class Vehicle {
	
	//ATB
	private String model;

	
	//CONST S/A
	public Vehicle () {
		
	}

	//CONST C/A
	public Vehicle(String model) {
		super();
		this.model = model;
	}

	//GET-SET
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
