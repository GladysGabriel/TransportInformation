package org.transport;
import org.road.Road;
import org.air.Air;
import org.water.Water;
public class Transport {
     private void transportForm() {
		System.out.println("Select one mode");
	}
	public static void main(String[] args) {
		Transport t= new Transport();
		Road r = new Road();
		Water w= new Water();
		Air a= new Air();
		t.transportForm();
		r.bike();
		r.cycle();
		r.bus();
		r.car();
		w.boat();
		w.ship();
		a.aeroplane();
		a.helicopter();
	}
}
