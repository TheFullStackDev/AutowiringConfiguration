package com.dibas.food;

import org.springframework.beans.factory.annotation.Autowired;

public class Meal {

	//@Autowired
	private Fruit fruit;
	//@Autowired
	private Dairy dairy;
	//@Autowired
	private Grain grain;
	//@Autowired
	private Meat meat;
	
	public Meal() {}
	
	@Autowired
	public Meal(Fruit fruit, Dairy dairy, Grain grain, Meat meat, Vegetable veg) {
		super();
		this.fruit = fruit;
		this.dairy = dairy;
		this.grain = grain;
		this.meat = meat;
		this.veg = veg;
	}


	private Vegetable veg;

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Grain getGrain() {
		return grain;
	}

	public void setGrain(Grain grain) {
		this.grain = grain;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Vegetable getveg() {
		return veg;
	}
	//@Autowired
	public void setveg(Vegetable veg) {
		this.veg = veg;
	}

	public String whatsInTodaysMeal() {

		String menu = "Today's Meal contains:\n";

		if (fruit != null)
			menu += "some fruits: ";
		if (dairy != null)
			menu += "some dairy: ";
		if (grain != null)
			menu += "some grain: ";
		if (meat != null)
			menu += "some meat: ";
		if (veg != null)
			menu += "some vegs: ";

		return menu;
	}

}
