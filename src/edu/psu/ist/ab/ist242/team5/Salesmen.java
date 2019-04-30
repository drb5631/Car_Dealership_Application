package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Salesmen {
    // Data members
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int emplID;
    private String phone;

    // Methods

    public Salesmen(int emplID, String firstName, String lastName, String email, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
        this.emplID = emplID;
        this.phone = phone;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public String setEmail(String email) {
        this.email = email;
        return email;
    }
    public String getEmail() {
        return email;
    }
    public String setAddress(String address) {
        this.address = address;
        return address;
    }
    public String getAddress() {
        return address;
    }
    public int setEmplID(int emplID) {
        this.emplID = emplID;
        return emplID;
    }
    public int getEmplID() {
        return emplID;
    }
    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }
    public String getPhone() {
        return phone;
    }

    public static void listSalesmen(ArrayList<Salesmen> sellerList) {
        for (Salesmen sellers : sellerList) {
            System.out.println("Salesman ID: " + sellers.getEmplID());
            System.out.println("First Name: " + sellers.getFirstName());
            System.out.println("Last Name: " + sellers.getLastName());
            System.out.println("Email: " + sellers.getEmail());
            System.out.println("Address: " + sellers.getAddress());
            System.out.println("Phone: " + sellers.getPhone() + "\n");
        }
    }
}