package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class SalesLeads {

    //Class Data Members

    private String emplLastName;
    private String emplFirstName;
    private String custFirstName;
    private String custLastName;
    private int SalesLeadID;
    private int emplID;
    private double commission;
    private String SalesLeadDate;
    private double price;
    private boolean SalesLeadActive;

    //class Methods

    /**
     * Constructor Method
     * @param SalesLeadID sales lead ID being created
     * @param emplID employee ID from salesmen being created
     * @param emplFirstName employee first name being created
     * @param emplLastName employee last name being created
     * @param custFirstName customer first name being created
     * @param custLastName customer last name being created
     * @param commission comission salesman makes being created
     * @param SalesLeadDate date the sale was sales lead was entered being created
     * @param SalesLeadActive tells if the lead is still active (true or false) being created
     * @param price price of the car being looked at being created
     * @author Huy Le
     * @since Spring 2019
     * @version 3.0
     */

    public SalesLeads(int SalesLeadID, int emplID, String emplFirstName, String emplLastName, String custFirstName, String custLastName, double commission, String SalesLeadDate, double price, boolean SalesLeadActive) {
        this.emplFirstName = emplFirstName;
        this.emplLastName = emplLastName;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
        this.SalesLeadID = SalesLeadID;
        this.emplID = emplID;
        this.commission = commission;
        this.SalesLeadDate = SalesLeadDate;
        this.price = price;
        this.SalesLeadActive = SalesLeadActive;
    }

    /**
     * Get employee first name
     * @author Huy Le
     * @return emplFirstName
     * @since Spring 2019
     * @version 3.0
     */

    public String getEmplFirstName() {
        return emplFirstName;
    }

    /**
     * Set employee first name
     * @author Huy Le
     * @param firstName employee first name
     * @since Spring 2019
     * @version 3.0
     */

    public void setEmplFirstName(String firstName) {
        this.emplFirstName = firstName;
    }

    /**
     * Get employee last name
     * @author Huy Le
     * @return empLastName
     * @since Spring 2019
     * @version 3.0
     */

    public String getEmplLastName() {
        return emplLastName;
    }

    /**
     * Set employee last name
     * @author Huy Le
     * @param lastName employee last name
     * @since Spring 2019
     * @version 3.0
     */

    public void setEmplLastName(String lastName) {
        this.emplLastName = lastName;
    }

    /**
     * Get customer first name
     * @author Huy Le
     * @return custFirstName
     * @since Spring 2019
     * @version 3.0
     */

    public String getCustFirstName() {
        return custFirstName;
    }

    /**
     * Set customer first name
     * @author Huy Le
     * @param _firstName customer first name
     * @since Spring 2019
     * @version 3.0
     */

    public void setCustFirstName(String _firstName) {
        this.custFirstName = _firstName;
    }

    /**
     * Get customer last name
     * @author Huy Le
     * @return custLastName
     * @since Spring 2019
     * @version 3.0
     */

    public String getCustLastName() {
        return custLastName;
    }
    /**
     * Set customer last name
     * @author Huy Le
     * @param _lastName customer last name
     * @since Spring 2019
     * @version 3.0
     */

    public void setLastName(String _lastName) {
        this.custLastName = _lastName;
    }

    /**
     * Get sales lead ID
     * @author Huy Le
     * @return SalesLeadID
     * @since Spring 2019
     * @version 3.0
     */

    public int getSalesLeadID() {
        return SalesLeadID;
    }

    /**
     * Set sales lead ID
     * @author Huy Le
     * @param _SalesLeadID ID of the sales lead
     * @since Spring 2019
     * @version 3.0
     */

    public void setSalesLeadID(int _SalesLeadID) {
        this.SalesLeadID = _SalesLeadID;
    }

    /**
     * Get employee ID
     * @author Huy Le
     * @return empID
     * @since Spring 2019
     * @version 3.0
     */

    public int getEmplID() {
        return emplID;
    }

    /**
     * Set employee ID
     * @author Huy Le
     * @param _emplID ID of the employee showing the car
     * @since Spring 2019
     * @version 3.0
     */

    public void setEmplID(int _emplID) {
        this.emplID = _emplID;
    }

    /**
     * Get comission
     * @author Huy Le
     * @return commission
     * @since Spring 2019
     * @version 3.0
     */

    public double getCommission() {
        return commission;
    }

    /**
     * Set comission
     * @author Huy Le
     * @param _commission pocket money the salesmen will make
     * @since Spring 2019
     * @version 3.0
     */

    public void setCommission(int _commission) {
        this.commission = _commission;
    }

    /**
     * Get sales date
     * @author Huy Le
     * @return SalesLeadDate
     * @since Spring 2019
     * @version 3.0
     */

    public String getSalesDate() {
        return SalesLeadDate;
    }

    /**
     *Set sales date
     * @author Huy Le
     * @param _SalesLeadDate date the sales lead was initiated
     * @since Spring 2019
     * @version 3.0
     */

    public void setSalesDate(String _SalesLeadDate) {
        this.SalesLeadDate = _SalesLeadDate;
    }

    /**
     * Get price
     * @author Huy Le
     * @return price
     * @since Spring 2019
     * @version 3.0
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set price
     * @author Huy Le
     * @param price price the car is being sold for
     * @since Spring 2019
     * @version 3.0
     */

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get if the lead is active
     * @author Huy Le
     * @return SalesLeadActive
     * @since Spring 2019
     * @version 3.0
     */

    public boolean getLeadActive() {
        return SalesLeadActive;
    }

    /**
     * Set if the lead is active
     * @author Huy Le
     * @param _SalesLeadActive tells if the lead is still active or not (true or false)
     * @since Spring 2019
     * @version 3.0
     */

    public void setSalesLeadActive(boolean _SalesLeadActive) {
        this.SalesLeadActive = _SalesLeadActive;
    }

    /**
     * List out the called sales leads
     * @author Huy Le
     * @param salesList list of sales leads
     * @since Spring 2019
     * @version 3.0
     */

    public static void listSalesLeads(ArrayList<SalesLeads> salesList) {
        for (SalesLeads leads : salesList) {
            System.out.println("Sale ID: " + leads.getSalesLeadID());
            System.out.println("Employee:\nEmployee ID: " + leads.getEmplID());
            System.out.println("First Name: " + leads.getEmplFirstName());
            System.out.println("Last Name: " + leads.getEmplLastName());
            System.out.println("Customer:\nCustomer First Name: " + leads.getCustFirstName());
            System.out.println("Last Name: " + leads.getCustLastName());
            System.out.println("Sale Details:\nCommission: " + leads.getCommission());
            System.out.println("Sale Lead Date: " + leads.getSalesDate());
            System.out.println("Dealer Price: " + leads.getPrice());
            System.out.println("Sale Lead Active: " + leads.getLeadActive() + "\n");
        }
    }

}