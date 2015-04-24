package edu.uop.students.teama;

public class ClientStore {
    
    public void print() 
    {
        for (int i = 0; i < clients.size(); i++) 
        {
          Client a = clients.get(i);
            System.out.println(a.toString());
        }
    }
    public int size()
    {
        return (clients == null) ? 0 : clients.size();
    }
    public void write(Client[] clients, RandomAccessFile file) throws IOException
    {
        for (int i = 0; i < clients.length; i++)
        {
        byte[] bytes = clients[i].toString().getBytes();
        for(byte byteWrite : bytes)
        {
            file.writeByte(byteWrite);
        }
        }


}
