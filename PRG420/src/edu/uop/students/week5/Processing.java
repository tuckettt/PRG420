package edu.uop.students.week5;

import java.io.*;
import java.util.*;


public class Processing {

	public static void main(String[] args){

		Processing run = new Processing();
		run.GetitDone();
	}	
	
	public void GetitDone(){
		Do doit = new Do("4358843593","Tuckett","Troy","973 Ruben","Grantsville","UT","84029");
		doit.loadData();
		
		ReadFiles rf = new ReadFiles();
		rf.Read(); //open the file "4122513144.xm" 
	}

 class ReadFiles{
		String tel;

		public void Read() {
			Scanner input = new Scanner(System.in);
			tel = "4122513144.xml"; //input.nextLine(); to enable scanner input
			System.out.println("Please enter a phone number: /n No spaces or dashes please:");
			ReadFiles rxml = new ReadFiles();
			try{
				Properties prop = rxml.readProperties();
				prop.list(System.out); //load the ptoperties to system
				String LastName = prop.getProperty("Last Name"); //Load the properties one by one
				String FirstName = prop.getProperty("First Name");      
				String AddStreet = prop.getProperty("Street ");        
				String AddCity = prop.getProperty("City");                 
				String AddState = prop.getProperty("State");
				String AddZip = prop.getProperty("Zipcode");
			} catch (Exception exception) {                                         /// catch errors and report it back
				exception.printStackTrace();
			}
		}

		public Properties readProperties() throws Exception {
			Properties prop = new Properties();
			FileInputStream propstream = new FileInputStream("\\db" + tel +".xml");
			prop.loadFromXML(propstream);

			return prop;
		}			
	}

	class Do  {

		String Telephone, FirstName, LastName, AddStreet, AddCity, AddState, AddZip;

		public Do(String Telephone, String LastName, String FirstName, String AddStreet, String AddCity, String AddState, String AddZip){ // we are going to use this method to set the values of i,p, nad n dynamically from this we can set the values and get retunr the values
			Telephone = Telephone;
			LastName = LastName;
			FirstName= FirstName;
			AddStreet = AddStreet;
			AddCity = AddCity;
			AddState = AddState;
			AddZip = AddZip;

		}
		public void WriteFile()   {
			Properties dbentry = new Properties();             //creates the object "dbentry"
			dbentry.setProperty("Last Name",getLastName());    //adds a property to debentry and gives it a value
			dbentry.setProperty("First Name",getFirstName());       //adds another property and gives it value
			dbentry.setProperty("Street",getAddStreet());       
			dbentry.setProperty("City", getAddCity());
			dbentry.setProperty("State",getAddState());
			dbentry.setProperty("Zipcode",getAddZip());

			try  {
				File dbfile = new File("db\\"+ getTelephone() + ".xml"); //t
				FileOutputStream dbStream=new FileOutputStream (dbfile);
				Date current = new Date();
				dbentry.storeToXML (dbStream, "Creation Date :" + current); 
			} catch (IOException exception) {                                         /// catch errors and report it back
				System.out.println("Error: " + exception.getMessage());
			}
		}                                                                   

		public void setTelephone(String a1) { //Begin Setter Methods
			Telephone = a1;
		}

		public void setFirstName(String a2){
			FirstName = a2;
		}

		public void setLastName(String a3) {
			LastName= a3;
		}

		public void setAddStreet(String a4) {
			AddStreet = a4;
		}

		public void setAddCity(String a5) {
			AddCity = a5;
		}

		public void setAddState(String a6) {
			AddState = a6;
		}

		public void setAddZip(String a7) {  // end Setter ethods
			AddZip = a7;
		}

		public String getTelephone(){   //begin Getter Methods
			return Telephone;
		}

		public String getLastName(){
			return LastName;
		}

		public String getFirstName(){
			return FirstName;
		}

		public String getAddStreet(){
			return AddStreet;
		}

		public String getAddCity(){
			return AddCity;
		} 
		public String getAddState(){
			return AddState;
		}

		public String getAddZip(){
			return AddZip;
		}
		/*More Utility Methods below*/

		public long checkFiles(File db){  //check file we need to feed this the directory name.

			long numFiles =0;

			if(db.isDirectory()){ // to check if it is a directory
				File[] files = db.listFiles(); // for all files and subdirectories
				for (int i = 0; i < files.length; i++){
					numFiles += checkFiles(files[i]); // count array elements
				}
			}
			else{
				numFiles += db.length();
			}
			return numFiles; //returns the number of files. the main method in the main class should use checkFile() < our constant to ensure the number of files is less than the constant. The constant should be declare in the main class as static long "variable name" to make it a class variable.
		}

		public void loadData() {

			Do[] loadit = new Do[10];
			loadit[0] = new Do("4122513144", "Clinton", "Burris", "629 Beechwood Drive", "Pittsburgh", "PA", "15219");
			loadit[1] = new Do("8312557265", "Michael", "Lewis", "2615 Ventura Drive", "San Francisco", "CA", "94111");
			loadit[2] = new Do("8312557265", "Kimberly", "Lewis", "2615 Ventura Drive", "San Francisco", "CA", "94111");
			loadit[3] = new Do("9726248431", "Diane", "Copeland", "3742 Worthington Drive", "Frisco", "TX", "75034");
			loadit[4] = new Do("7042454924", "Marlene", "Smith", "2564 Broadcast Drive", "Charlotte", "NC", "28202");
			loadit[5] = new Do("6016491726", "Bonnie", "Ackerman", "1015 Walnut Street", "Laurel", "MS", "39440");
			loadit[6] = new Do("2022346802", "Mary", "Forest", "4565 Goldcliff Circle", "Washington", "DC", "20009");
			loadit[7] = new Do("9726247788", "William", "Williams", "967 Alpha Avenue", "Longview", "TX", "75601");
			loadit[8] = new Do("7066521863", "Daisey", "Bush", "555 Radio Park Drive", "Maysville", "GA", "30558");
			loadit[9] = new Do("6196028837", "Nancy", "Ladner", "317 Poplar Avenue", "San Diego", "CA", "92103");
			for (int count = 0 ; count < loadit.length ; count++){
				loadit[count].WriteFile();

			}
		}
	}
}

