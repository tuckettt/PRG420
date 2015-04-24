package edu.uop.students.teama;

public class Client {
    
    /* Class Attributes */ 
    private String name;
    private String address;
    private String phoneNumber;
    
    /* Class Constructors */
    
public Client(String phoneNumber, String name, String address)
    {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }
    
    /* Class Methods */
    /* Functional Methods */
    
public void displayContact()
    {
        System.out.println("\n" + name);
        System.out.println(phoneNumber);
        System.out.println(address + "\n");
    }
    
    /* Getters and Setters*/
    
public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
public String getName()
    {
        return name;
    }
    
public String getAddress()
    {
        return address;
    }
    
public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    
public void setName(String name)
    {
        this.name = name;
    }
    
public void setAddress(String address)
    {
        this.address = address;
    }
    
public boolean validate(long phoneNumber)
    {
        return true;
    }    
}
