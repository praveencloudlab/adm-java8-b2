package com;

class BusOperator implements Runnable {

	int availableSeats = 1;
	int wanted;

	@Override
	public void run() {
		book();
	}

	public BusOperator(int wanted) {
		this.wanted = wanted;
	}

	public  void book() { 
		String tname = Thread.currentThread().getName();
		System.out.println("trying to book " + wanted + " seats for " + tname);
		synchronized (this) { // if p1 is in, 
			if (wanted <= availableSeats) {
				availableSeats = availableSeats - wanted;
				System.out.println(wanted + " seats booked successfully for " + tname);

			} else {
				System.out.println("no seats available for "+tname+" Avaible seats are: " + availableSeats);
			}
		}
		// ----all threads can access
		synchronized (tname) {
			// --
		}
		
		// all threads can access
		
		synchronized (this) {
			// --
		}
	}
}

public class Reservation {

	public static void main(String[] args) {

		BusOperator b1 = new BusOperator(1);

		Thread p1 = new Thread(b1, "passenger1");
		Thread p2 = new Thread(b1, "passenger2");

		p1.start();
		p2.start();

	}

}
