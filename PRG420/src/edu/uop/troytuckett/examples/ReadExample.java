package edu.uop.troytuckett.examples;

import java.io.*;

public class ReadExample {

   public static void main (String[] args) {

      //  prompt the user to enter their name
      System.out.print("Enter your name: ");

      //  This confusing line sets up the standard input buffer
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String userName = null;

      //  read the user name from the command-line.  This uses the readline() method
      //  which requires that the user hit enter after entering the name.
      try {
         userName = br.readLine();
      } catch (IOException io) {
         System.out.println("Error trying to read your name!");
      }

      System.out.println("Your name is " + userName);

   }
}
