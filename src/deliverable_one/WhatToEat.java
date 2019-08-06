package deliverable_one;

import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {
		
		String eventType;
		String meal = "";
		int partySize = 0;
		String preparation = "";
		String result;
		Scanner input = new Scanner(System.in);
		
		// Asks the user what type of event he/she will be hosting.
		System.out.println("What kind of event will you be hosting? Choose from the following: casual, semi-formal, formal");
		eventType = input.nextLine();

		if ("casual".equals(eventType)) {
			meal = "sandwiches";
		}
		else if ("semi-formal".equals(eventType)) {
			meal = "fried chicken";
		}
		else if ("formal".equals(eventType)) {
			meal = "chicken parmesan";
		}
		else {


		}
		
		// Asks the user about how many guests there will be attending the event
		System.out.println("Around how many guests will you be serving?");
		partySize = input.nextInt();
		
		if (partySize == 1) {
			preparation = "in your microwave";
		} else if (partySize >= 2 && partySize <= 12) {
			preparation = "in your kitchen";
		} else if (partySize >= 13) {
			preparation = "by a caterer";
		} else {

		}

		result = "Since you’re hosting a " + eventType + " event for " + partySize
				+ " participants, you should serve \n" + meal + " prepared " + preparation + ".";
		System.out.println(result);
	}
}
