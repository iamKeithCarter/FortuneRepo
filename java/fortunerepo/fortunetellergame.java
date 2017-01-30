/*
 * Fortune Teller
 * Author Keith Carter
 * 
 * */


package fortunerepo;

import java.util.Scanner;

public class fortunetellergame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean riskAnotherFortune;
		
		// do while to allow for user to re-run the program
do{
	
	
	 // ***************** Part 1******************************
	
		
		System.out.println("I see and hear all wecolme. ");
		System.out.println("Please enter your first name:");
		String firstName = scanner.next();
		firstName=firstName.toLowerCase();

		System.out.println(" Please enter your last name: ");
		String lastName = scanner.next();
		lastName = lastName.toLowerCase();
	

		System.out.println(" Please enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Please enter the month you were born: ");
		String birthMonth = scanner.next();
		birthMonth = birthMonth.toLowerCase();

		
		int colorEnteredCheck = 0;
		String modeOfTransport =" ";
		
		
		// ******** do while and switch to determine the mode of transport from color entry ***
		
		
		do{
		System.out.println(" Please enter your favorite ROYGBIV color: or enter \"Help\"");
		String faviColor = scanner.next();
		faviColor = faviColor.toLowerCase();
		
			switch(faviColor){
			
			case "red":
				modeOfTransport = "car";
				colorEnteredCheck =1;
				break;
			case "orange":
				modeOfTransport = "boat";
				colorEnteredCheck =1;
				break;
			case "yellow":
				modeOfTransport = "horse";
				colorEnteredCheck =1;
				break;
			case "green":
				modeOfTransport = "race car";
				colorEnteredCheck =1;
				System.out.println(modeOfTransport);
				break;
			case "blue":
				modeOfTransport = "space ship";
				colorEnteredCheck =1;
				break;
			case "indigo":
				modeOfTransport = "bike";
				colorEnteredCheck =1;
				break;
			case "violet":
				modeOfTransport = "foot";
				colorEnteredCheck =1;
				break;

			case "\"help\"":
				System.out.println(
						" ROYGBIV colors are RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, and VIOLET.");
				
				break;
				
			default:
				
				break;
			}	
			
			}while(colorEnteredCheck <= 0);	
			 
		


		System.out.println("Last question. How many siblings do you have? ");
		int simblingNumber = scanner.nextInt();

		// merge names together for ease of comparison
		String fullName = (firstName + lastName);
		int fullNameLength = fullName.length();

	

		
		int bankedAmount = 0;
		int trackingIndex;
		String letterOfMonth;
		int yearsToRetire;
		String retireLocation= "";
		
		
		

		int monthIndex1 = 0;
		int monthIndex2 = 1;

		// loop through the first 3 letters of month entered

		// ********* Part 2
		// ***********************************************************

		if (age % 2 == 1) {
			yearsToRetire = 45;
		}
		yearsToRetire = 90;

		if (simblingNumber == 0) {
			retireLocation = "Dayton, Ohio";

		} else if (simblingNumber == 1) {
			retireLocation = "Sanfrancisco";

		} else if (simblingNumber == 2) {
			retireLocation = "the Burmuda Triangle";

		} else if (simblingNumber == 3) {
			retireLocation = "a Spaceship to Mars";

		} else if (simblingNumber > 3) {
			retireLocation = "The Heart of The Sea";
		}

		
		// ******** Begin first loop to check letter of month
		// ****************************

		int compareResult;
		do {

			trackingIndex = monthIndex1;
			letterOfMonth = birthMonth.substring(monthIndex1++, monthIndex2++);

			

			// ******* second while loop to compare name characters with letter
			// of the month ***********

			int nameIndex1 = 0;
			int nameIndex2 = 1;

			

			
			do {
				String oneLetterInName = fullName.substring(nameIndex1++, nameIndex2++);
				compareResult = letterOfMonth.compareTo(oneLetterInName);
				
				
			} while (nameIndex2 <= fullNameLength && compareResult != 0);

			// **************************************************************************************

		} while (monthIndex2 <= 3 && compareResult != 0);

		

		
		if (trackingIndex == 0) {

			bankedAmount = 1175;

		} else if (trackingIndex == 1) {

			bankedAmount = 20000000;

		} else if (trackingIndex == 2) {

			bankedAmount = 30000;
		}

		

		// ******* End of Second loop
		// ************************************************************

		
		//**************** Part 3 output and restart ****************************
		System.out.println("This may be your fortune. " +firstName+ " "+ lastName + " will retire in "+ yearsToRetire+" years, with $" +bankedAmount+" in the bank, a vacation home in "+  retireLocation +" and a " + modeOfTransport);
		
		System.out.println("Would you risk another fortune? yes or no");
		String response = scanner.next();
		riskAnotherFortune = response.equals("yes");

	} while (riskAnotherFortune);
	System.out.println("Ha,Ha,Ha");
		
		scanner.close();
		
	}
	

}
