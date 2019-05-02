package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Inventory {

    //class data members

    private ArrayList carList;
    private ArrayList partsList;

    /**
     * @author Nay Ullah
     * Constructs the inventory item (cars, parts)
     * @since Spring 2019
     * @version 3.0
     */

    //class Methods

    public Inventory() {

        carList = new ArrayList<Cars>();
        partsList = new ArrayList<Parts>();
    }

    /**
     * Sets cars
     * @author Nay Ullah
     * @param _car
     * @since Spring 2019
     * @version 3.0
     */

    public void setCars(Cars _car) {
        carList.add(_car);
    }

    /**
     * Gets the car
     * @author Nay Ullah
     * @param _car
     * @since Spring 2019
     * @version 3.0
     * @return car - New Cars
     */

    public Cars getCars(int _car) {
        return (Cars) carList.get(_car);
    }

    /**
     * Sets the part
     * @author Nay Ullah
     * @param _part
     * @since Spring 2019
     * @version 3.0
     */

    public void setParts(Parts _part) {
        partsList.add(_part);
    }

    /**
     * Gets the part
     * @author Nay Ullah
     * @param _part
     * @since Spring 2019
     * @version 3.0
     * @return part - New Parts
     */

    public Parts getParts(int _part) {
        return (Parts) partsList.get(_part);
    }
}
