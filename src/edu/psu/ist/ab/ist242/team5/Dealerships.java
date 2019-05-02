package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Dealerships {

    // Data members

    private String city;
    private String state;
    private int zip;

    //Methods

    /**
     * Constructor method for constructing a dealership location
     * @author Brian Tu
     * @param city
     * @param state
     * @param zip
     * @since Spring 2019
     * @version 3.0
     */

    public Dealerships(String city, String state, int zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * Set dealership city
     * @author Brian Tu
     * @param city
     * @since Spring 2019
     * @version 3.0
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get dealership city
     * @author Brian Tu
     * @return dealership city location
     * @since Spring 2019
     * @version 3.0
     */

    public String getCity() {
        return city;
    }

    /**
     * Set dealership state
     * @author Brian Tu
     * @param state
     * @since Spring 2019
     * @version 3.0
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get dealership state
     * @author Brian Tu
     * @return dealership state location
     * @since Spring 2019
     * @version 3.0
     */

    public String getState() {
        return state;
    }

    /**
     * Set dealership zip code
     * @author Brian Tu
     * @param zip
     * @since Spring 2019
     * @version 3.0
     */

    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Get dealership zip code
     * @author Brian Tu
     * @return dealership zip code location
     * @since Spring 2019
     * @version 3.0
     */

    public int getZip() {
        return zip;
    }

    /**
     * List dealership locations
     * @author Brian Tu
     * @since Spring 2019
     * @version 3.0
     */

    public static void listDealerships(ArrayList<Dealerships> dealerList) {
        for (Dealerships dealer : dealerList) {
            System.out.println("Dealer Location:");
            System.out.println("City: " + dealer.getCity());
            System.out.println("State: " + dealer.getState());
            System.out.println("Zip Code: " + dealer.getZip());
        }
    }
}

