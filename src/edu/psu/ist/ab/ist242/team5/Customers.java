package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Customers {
    //Data members
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int custID;
    private String phone;
    private String SSN;

    // Methods

    /**
     * Constructor method (constructs a new customer)
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public Customers(int custID, String firstName, String lastName, String address, String email, String phone,String SSN) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.SSN = SSN;
    }

    /**
     * Set first customer first name
     * @param firstName
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets customer first name
     * @return firstName
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets customer last name
     * @param lastName
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets customer last name
     * @return last name
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Sets customer address
     * @param address
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets customer address
     * @return address
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public String getAddress() {
        return address;
    }

    /**
     * Sets customer email
     * @param email
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets customer email
     * @return email
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public String getEmail() {
        return email;
    }

    /**
     * Sets customer ID
     * @param custID
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setCustID(int custID) {
        this.custID = custID;
    }

    /**
     * Gets customer ID
     * @return customer ID
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public int getCustID() {
        return custID;
    }

    /**
     * Sets customer phone number
     * @param phone
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets customer phone number
     * @return phone number
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public String getPhone() {
        return phone;
    }

    /**
     * Sets customer social security number
     * @param SSN
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /**
     * Gets customer social security number
     * @return Social Security Number
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public String getSSN() {
        return SSN;
    }

    /**
     * Lists all the customers
     * @author Yongkang Deng
     * @since Spring 2019
     * @version 3.0
     */

    public static void listCustomers(ArrayList<Customers> custList) {
        for (Customers customer : custList) {
            System.out.println("Customer ID: " + customer.getCustID());
            System.out.println("First Name: " + customer.getFirstName());
            System.out.println("Last Name: " + customer.getLastName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println("SSN: " + customer.getSSN() + "\n");
        }
    }
}