package edu.uop.students.week5;

/*
 * Client Listing
 * Version 1.1
 * 3/24/2012
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * PRG/420 Wayne Grier, Tony Guthrie, Ryan Wendt, Jody Westendorf Instructor:
 * Troy Tuckett Week 5 Team B Assignment
 * 
 * Stores and retrieves client contact information.
 */
public class Client {

	// Declare class attributes
	private String clientFirstName;
	private String clientLastName;
	private String clientAddress;
	private String clientCity;
	private String clientState;
	private String clientZip;
	private String clientPhone;

	public static void main(String[] args) {

		// Display options to user
		// Keep displaying the menu until the user quits
		String choice = "";
		while (choice.equals("3") == false) {
			System.out
					.println("Press a number then [Enter] to make a selection:\n"
							+ "1. Add Client\n2. Find a Client\n3. Quit\n");
			// Create user input object and process input
			Scanner userInput = new Scanner(System.in);
			choice = userInput.next();
			if (choice.equals("1")) {
				// Create new client object and run setClientInfo method
				Client newClient = new Client();
				newClient.setClientInfo();
			} else if (choice.equals("2")) {
				getClientInfo();
			} else if (choice.equals("3")) {
				System.out.println("Quitting");
			} else {
				System.out.println("Invalid choice.");
			}
		}
	}

	public static boolean verifyPhone(String phoneToVerify) {
		// get number of characters entered as phone number
		int phoneLength = phoneToVerify.length();

		// if the phone number entered is 10 digits, go ahead and check
		// whether it's numberic. If it's both 10 digits and numeric, return
		// true
		if (phoneLength == 10) {
			try {
				Long.parseLong(phoneToVerify);
				// System.out.println("It's 10 and numeric.");
				return true;
			} catch (Exception e) {
				// System.out.println("It's 10 but not numeric.");
				return false;
			}
		} else {
			// System.out.println("It's not 10 so we didn't check if numeric.");
			return false;
		}

	}

	public void setClientInfo() {
		// Create user input object and process input
		Scanner userInput = new Scanner(System.in);

		System.out.print("First Name:  ");
		clientFirstName = userInput.nextLine();

		System.out.print("Last Name:  ");
		clientLastName = userInput.nextLine();

		System.out.print("Street Address:  ");
		clientAddress = userInput.nextLine();

		System.out.print("City:  ");
		clientCity = userInput.nextLine();

		System.out.print("State:  ");
		clientState = userInput.nextLine();

		System.out.print("Zip Code:  ");
		clientZip = userInput.nextLine();

		// Need to verify phone number is valid as part of input
		boolean phoneIsValid = false;
		while (phoneIsValid == false) {
			System.out.print("Phone Number (10 digits, no punctuation):  ");
			clientPhone = userInput.nextLine();
			phoneIsValid = verifyPhone(clientPhone);
		}

		System.out.println("\n\nAdding the following client information:\n");

		System.out.println("First Name:\t" + clientFirstName);
		System.out.println("Last Name:\t" + clientLastName);
		System.out.println("Street Address:\t" + clientAddress);
		System.out.println("City:\t\t" + clientCity);
		System.out.println("State:\t\t" + clientState);
		System.out.println("Zip:\t\t" + clientZip);
		System.out.println("Phone:\t\t" + clientPhone);

		System.out
				.println("\nAre you sure you want to add this client? \ny = Yes\nn = No");
		String continueAdd = userInput.next();
		if (continueAdd.equals("y")) {
			// Create ClientData object
			ClientData newClientData = new ClientData();
			// Call saveClient method to save the client data to file
			newClientData.saveClient(clientFirstName, clientLastName,
					clientAddress, clientCity, clientState, clientZip,
					clientPhone);

			// System.out.println("\nWe would call ClientData.saveClient here.\n");
		} else {
			System.out.println("\nOK. We won't save it.\n");
		}
	}

	public static void getClientInfo() {
		// Get user search input (phone number)
		System.out
				.print("Enter the phone number to search for (10 digits, no punctuation):  ");

		// Create user input object and process input
		Scanner userInput = new Scanner(System.in);
		String searchPhone = userInput.next();

		// Create ClientData object
		ClientData searchClientData = new ClientData();

		// Call searchClients method to find a record
		String searchResults = searchClientData.searchClients(searchPhone);

		// Make sure a result was returned.
		if (!searchResults.equals("No matching client entry found.\n")) {
			// Split string on "," to create array then print results.
			String[] clientArray = searchResults.split(",");

			System.out.println("\nFirst Name:\t" + clientArray[0]);
			System.out.println("Last Name:\t" + clientArray[1]);
			System.out.println("Street Address:\t" + clientArray[2]);
			System.out.println("City:\t\t" + clientArray[3]);
			System.out.println("State:\t\t" + clientArray[4]);
			System.out.println("Zip:\t\t" + clientArray[5]);
			System.out.println("Phone:\t\t" + clientArray[6] + "\n");

		} else {
			// Print search results
			System.out.println(searchResults);
		}
	}
} // End Client Class

/*
 * Client Listing Version 1.1 3/24/2012
 */

/**
 * PRG/420 Wayne Grier, Tony Guthrie, Ryan Wendt, Jody Westendorf Instructor:
 * Troy Tuckett Week 5 Team B Assignment
 * 
 * Stores and retrieves client contact information.
 */

class ClientData { // Start ClientData Class

	private String clientName;
	private String clientAddress;
	private String clientPhone;
	private String outputString;
	private String foundClient = "No matching client entry found.\n";

	public ClientData() // Initializing Constructor
	{
	}

	public void saveClient(String clientFirstName, String clientLastName,
			String clientAddress, String clientCity, String clientState,
			String clientZip, String clientPhone) {
		// Build the csv line to save.

		this.clientName = clientFirstName + "," + clientLastName;
		this.clientAddress = clientAddress + "," + clientCity + ","
				+ clientState + "," + clientZip;
		this.clientPhone = clientPhone;

		this.outputString = this.clientName + "," + this.clientAddress + ","
				+ this.clientPhone + "\n";

		try {

			// Create file system object for appending to file if file doesn't
			// exist it will be created automatically.
			FileWriter out = new FileWriter("clients.txt", true);

			// Write the file
			out.write(this.outputString);
			out.close();

			// Print success message.
			System.out.println("\n\nSaved client file.\n");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public String searchClients(String searchPhone) {
		try {

			// Create filesystem objects for reading the clients.txt file

			BufferedReader bRead = new BufferedReader(new FileReader(
					"clients.txt"));

			// Run through each line of the client data file and look for the
			// phone number
			String clientDataEntry;
			while ((clientDataEntry = bRead.readLine()) != null) {
				// System.out.println(clientDataEntry);

				// Split the entry on the comma delimiter and save in an array
				String[] clientArray = clientDataEntry.split(",");

				// The phone number is at Index 6 of the client data array
				if (searchPhone.equals(clientArray[6])) {
					// System.out.println("I matched!");
					foundClient = clientDataEntry;
				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return foundClient;
	}

} // End ClientData Class

