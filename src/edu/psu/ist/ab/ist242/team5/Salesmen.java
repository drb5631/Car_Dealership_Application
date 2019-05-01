package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Salesmen {

    // Class Data Members
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int emplID;
    private String phone;

    /**
     * Constructor Method
     * @param emplID
     * @param firstName
     * @param lastName
     * @param email
     * @param address
     * @param phone
     * @author Huy Le
     * @since Spring 2019
     * @version 3.0
     */

    public Salesmen(int emplID, String firstName, String lastName, String email, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
        this.emplID = emplID;
        this.phone = phone;
    }

    /**
     * @author Huy Le
     * @param firstName
     * @since Spring 2019
     * @version 3.0
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @author Huy Le
     * @return firstName
     * @since Spring 2019
     * @version 3.0
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * @author Huy Le
     * @return lastName
     * @since Spring 2019
     * @version 3.0
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * @author Huy Le
     * @param lastName
     * @since Spring 2019
     * @version 3.0
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @author Huy Le
     * @param email
     * @since Spring 2019
     * @version 3.0
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @author Huy Le
     * @returm email
     * @since Spring 2019
     * @version 3.0
     */

    public String getEmail() {
        return email;
    }

    /**
     * @author Huy Le
     * @param address
     * @since Spring 2019
     * @version 3.0
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @author Huy Le
     * @returm address
     * @since Spring 2019
     * @version 3.0
     */

    public String getAddress() {
        return address;
    }

    /**
     * @author Huy Le
     * @param emplID
     * @since Spring 2019
     * @version 3.0
     */

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    /**
     * @author Huy Le
     * @return emplID
     * @since Spring 2019
     * @version 3.0
     */

    public int getEmplID() {
        return emplID;
    }

    /**
     * @author Huy Le
     * @param phone
     * @since Spring 2019
     * @version 3.0
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @author Huy Le
     * @returm phone
     * @since Spring 2019
     * @version 3.0
     */

    public String getPhone() {
        return phone;
    }

    /**
     * List all salesmen
     * @author Huy Le
     * @since Spring 2019
     * @version 3.0
     */

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