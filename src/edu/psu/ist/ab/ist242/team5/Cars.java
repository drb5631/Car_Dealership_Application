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
     * @param ID ID of the car being created
     * @param make make of the car being created
     * @param model model of the car being created
     * @param year year of the car being created
     * @param color color of the car being created
     * @param MPG miles/gallon for the car being created
     * @param horsePower horse power associated with the car being created
     * @param VIN special serial number for the car being created
     * @param MSRP manufacturer suggested retail price for the car being created
     * @param dealerPrice price the dealership is going to sell the car for that is being created
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
     * @param id car ID
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
     * @param make make of the car
     * @since Spring 2019
     * @version 3.0
     */

    public void setMake(String make) {
        this.make = make;
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
     * @param model model of the car
     * @since Spring 2019
     * @version 3.0
     */

    public void setModel(String model) {
        this.model = model;
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
     * @param year year the car was released
     * @since Spring 2019
     * @version 3.0
     */

    public void setYear(int year) {
        this.year = year;
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
     * @param color color of the car
     * @since Spring 2019
     * @version 3.0
     */

    public void setColor(String color) {
        this.color = color;
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
     * @param MPG miles/gallon for the car
     * @since Spring 2019
     * @version 3.0
     */

    public void setMPG(int MPG) {
        this.MPG = MPG;
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
     * @param horsePower the car's horse power level
     * @since Spring 2019
     * @version 3.0
     */

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
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
     * @param VIN vehicle identification number associated with the car
     * @since Spring 2019
     * @version 3.0
     */

    public void setVIN(int VIN) {
        this.VIN = VIN;
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
     * @param MSRP MSRP, or suggested price the car should be sold at
     * @since Spring 2019
     * @version 3.0
     */

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
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
     * @param dealerPrice the price the dealership will see the car for
     * @since Spring 2019
     * @version 3.0
     */

    public void setDealerPrice(double dealerPrice) {
        this.dealerPrice = dealerPrice;
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
     * @param carList list of cars
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