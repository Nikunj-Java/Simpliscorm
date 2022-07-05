package com.simplilearn.inheritance;

public class MontainBike extends Bicycle {

	
	private int seatHeight;
	
	//constructor
	public MontainBike(int gear, int speed,int seatHeight) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		this.seatHeight=seatHeight;

	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MontainBike ["+super.toString()+"\n SeatHeight="+ seatHeight +"]";
	}
	
	 

}
