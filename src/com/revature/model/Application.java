package com.revature.model;

import java.util.Comparator;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Route route1=new Route("Solapur", "Pune");
		Route route2=new Route("Mumbai", "Pune");
		Route route3=new Route("Hydrabad", "Pune");
		//Route route4=new Route("Aurangabad", "Pune");
		//Route route5=new Route("Ahemednagar", "Pune");
		//Route route6=new Route("Navimumbai", "Pune");
		TreeSet <Route> trip =new  TreeSet<Route>(new Comparator<Route>() {
		public int compare(Route r1,Route r2) {
			//return r1.getSource().compareTo(r2.getSource());
			return r1.getDestination().compareTo(r2.getSource());
		}
			
		});
		trip.add(route1);
		trip.add(route2);
		trip.add(route3);
		
		for(Route val : trip) {
			System.out.println(val);
		}
		
		
		
	}

}
