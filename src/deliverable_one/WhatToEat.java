package deliverable_one;

import java.util.ArrayList;
import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {
		
		String eventType = "";
		String meal = "";
		int partySize = 0;
		String preparation = "";
		String result;
		Scanner input = new Scanner(System.in);
		boolean isNumber;
		boolean isOption;
		ArrayList<String> eventOptions = new ArrayList<String>(4);
		eventOptions.add("casual");
		eventOptions.add("semi-formal");
		eventOptions.add("formal");
		
		// Asks the user what type of event he/she will be hosting.
		System.out.println(
				"What kind of event will you be hosting? Choose from the following: casual, semi-formal, formal");
		eventType = input.nextLine();
		
		// This validates whether the user chose one of the options.
		do {
			if (eventOptions.contains(eventType)) {
				isOption = true;
			}
			else {
				System.out.println("Please choose from the following options: casual, semi-formal, or formal.");
				isOption = false;
				eventType = input.nextLine();
			}
				
		} while (!(isOption));

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
