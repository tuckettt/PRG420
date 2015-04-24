package edu.uop.students.teama;

import java.io.RandomAccessFile;
public class MainApp
{

    public static void main(String[] args) throws Exception 
    {
        new MainApp().start();

    }
    private Client[] clients;
    /**
     *
     * @throws Exception
     */
    public void start()throws Exception 
    {
        ClientStore details;
        details = new ClientStore();
        Client a = new Client("Becky O'Brien", "65 Yellow Brick Rd., Newark, NJ", "7629746574");
        Client b = new Client("Fabio Borini", "746 Tin Man Dr., Raleigh, NC", "8761369446");
        Client c = new Client("Gaston Ramirez", "374 Goodman St., New York, NY", "4198345012");
        Client d = new Client("Luis Suarez", "93 Florence Rd., Tampa, FL", "8689898781");
        Client e = new Client("Andy Carroll", "3958 Person St., Cameron, NC", "8534567887");
        details.add(a);
        details.add(b);
        details.add(c);
        details.add(d);
        details.add(e);
        //details.print();
        try (RandomAccessFile file = new RandomAccessFile("ContactDetails.txt","rw")) {
            Client[] client = {a,b,c,d,e};
            details.write(clients, file);
            details.readAll(file);
        }


     }


 }
