package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Cars {

    //Data members

    private int carID;
    private String make;
    private String model;
    private int year;
    private String color;
    private int MPG;
    private int horsePower;
    private int VIN;
    private double MSRP;
    private double dealerPrice;

    //Methods

    /**
     * Constructor Method
     * @param ID
     * @param make
     * @param model
     * @param year
     * @param color
     * @param MPG
     * @param horsePower
     * @param VIN
     * @param MSRP
     * @param dealerPrice
     * @author David Lulko
     * @since Spring 2019
     * @version 3.0
     */

    public Cars(int ID, String make, String model, int year, String color, int MPG, int horsePower, int VIN, double MSRP, double dealerPrice) {
        this.carID = ID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.MPG = MPG;
        this.horsePower = horsePower;
        this.VIN = VIN;
        this.MSRP = MSRP;
        this.dealerPrice = dealerPrice;
    }

    /**
     * Set car ID
     * @author David Lulko
     * @param id
     * @since Spring 2019
     * @version 3.0
     */

    public void setID(int id) {
        this.carID = id;
    }

    /**
     * Get car ID
     * @author David Lulko
     * @return carID
     * @since Spring 2019
     * @version 3.0
     */

    public int getID() {
        return carID;
    }

    /**
     * Set car make
     * @author David Lulko
     * @param make
     * @since Spring 2019
     * @version 3.0
     */

    public String setMake(String make) {
        this.make = make;
        return make;
    }

    /**
     * Get car make
     * @author David Lulko
     * @return make
     * @since Spring 2019
     * @version 3.0
     */

    public String getMake() {
        return make;
    }

    /**
     * Set car model
     * @author David Lulko
     * @param model
     * @since Spring 2019
     * @version 3.0
     */

    public String setModel(String model) {
        this.model = model;
        return model;
    }

    /**
     * Get car model
     * @author David Lulko
     * @return model
     * @since Spring 2019
     * @version 3.0
     */

    public String getModel() {
        return model;
    }

    /**
     * Set car year
     * @author David Lulko
     * @param year
     * @since Spring 2019
     * @version 3.0
     */

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    /**
     * Get car year
     * @author David Lulko
     * @return year
     * @since Spring 2019
     * @version 3.0
     */

    public int getYear() {
        return year;
    }

    /**
     * Set car color
     * @author David Lulko
     * @param color
     * @since Spring 2019
     * @version 3.0
     */

    public String setColor(String color) {
        this.color = color;
        return color;
    }

    /**
     * Get car color
     * @author David Lulko
     * @return color
     * @since Spring 2019
     * @version 3.0
     */

    public String getColor() {
        return color;
    }

    /**
     * Set car miles per gallon
     * @author David Lulko
     * @param MPG
     * @since Spring 2019
     * @version 3.0
     */

    public int setMPG(int MPG) {
        this.MPG = MPG;
        return MPG;
    }

    /**
     * Get car miles per gallon
     * @author David Lulko
     * @return MPG
     * @since Spring 2019
     * @version 3.0
     */

    public int getMPG() {
        return MPG;
    }

    /**
     * Set car horsepower
     * @author David Lulko
     * @param horsePower
     * @since Spring 2019
     * @version 3.0
     */

    public int setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return horsePower;
    }

    /**
     * Get car horsepower
     * @author David Lulko
     * @return horsePower
     * @since Spring 2019
     * @version 3.0
     */

    public int getHorsePower() {
        return horsePower;
    }

    /**
     * Set car vehicle identification number
     * @author David Lulko
     * @param VIN
     * @since Spring 2019
     * @version 3.0
     */

    public int setVIN(int VIN) {
        this.VIN = VIN;
        return VIN;
    }

    /**
     * Get car vehicle identification number
     * @author David Lulko
     * @return VIN
     * @since Spring 2019
     * @version 3.0
     */

    public int getVIN() {
        return VIN;
    }

    /**
     * Set car MSRP
     * @author David Lulko
     * @param MSRP
     * @since Spring 2019
     * @version 3.0
     */

    public double setMSRP(double MSRP) {
        this.MSRP = MSRP;
        return MSRP;
    }

    /**
     * Get car MSRP
     * @author David Lulko
     * @return MSRP
     * @since Spring 2019
     * @version 3.0
     */

    public double getMSRP() {
        return MSRP;
    }

    /**
     * Set dealer price
     * @author David Lulko
     * @param dealerPrice
     * @since Spring 2019
     * @version 3.0
     */

    public double setDealerPrice(double dealerPrice) {
        this.dealerPrice = dealerPrice;
        return dealerPrice;
    }

    /**
     * Get dealer price
     * @author David Lulko
     * @return dealerPrice
     * @since Spring 2019
     * @version 3.0
     */

    public double getDealerPrice() {
        return dealerPrice;
    }

    /**
     * List each car in the cars list
     * @author David Lulko
     * @since Spring 2019
     * @version 3.0
     */

    public static void listCars(ArrayList<Cars> carList) {
        for (Cars car: carList) {
            System.out.println("Car ID: " + car.getID());
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Color: " + car.getColor());
            System.out.println("MPG: " + car.getMPG());
            System.out.println("Horse Power: " + car.getHorsePower());
            System.out.println("VIN: " + car.getVIN());
            System.out.println("MSRP: " + car.getMSRP());
            System.out.println("Dealer Price: " + car.getDealerPrice() + "\n");
        }
    }
}