package com.company;

import java.io.*;

public class Main {

    //write the data to the file
    public static void main(String[] args) {

        Customer customer = new Customer("SACHIN",9999.99);
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream("C:\\Users\\prati\\OneDrive\\Desktop\\customer\\Customerdata.txt");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(customer);
            System.out.println("File created successfully...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    readDataFromFile();
    }

    //read the data from the file
    public static void readDataFromFile(){
        Customer customer = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try {
            fin = new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\customer\\Customerdata.txt");
            ois = new ObjectInputStream(fin);
            customer = (Customer) ois.readObject();
            System.out.println(customer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
