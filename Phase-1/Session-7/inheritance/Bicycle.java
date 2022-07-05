package com.simplilearn.inheritance;

public class Bicycle {
	
	private int gear;
	private int speed;
	
	
	public Bicycle(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
		
	}
 
	//method to decrease speed
	public void applyBreak( int decreament) {
		speed -= decreament;
	}
	//method to increase speed
	public void speedup(int increment) {
		speed += increment;
		
	}

	@Override
	public String toString() {
		return "Bicycle [No of Gear=" + gear + ", speed of Bike=" + speed + "]";
	}
	
	 
	
}
