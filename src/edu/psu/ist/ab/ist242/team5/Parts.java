package edu.psu.ist.ab.ist242.team5;

import java.util.ArrayList;

public class Parts {

    //Data members

    private String partName;
    private String partType;
    private int partID;

    //Methods

    /**
     * Constructor Method
     * @param ID
     * @param name
     * @param type
     * @author David Lulko
     * @since Spring 2019
     * @version 3.0
     */

    public Parts (int ID, String name, String type) {
        this.partID = ID;
        this.partName = name;
        this.partType = type;
    }

    /**
     * Set part name
     * @author David Lulko
     * @param partName
     * @since Spring 2019
     * @version 3.0
     */

    public String setPartName(String partName) {
        this.partName = partName;
        return partName;
    }

    /**
     * Get part name
     * @author David Lulko
     * @return partName
     * @since Spring 2019
     * @version 3.0
     */

    public String getPartName() {
        return partName;
    }

    /**
     * Set part type
     * @author David Lulko
     * @param partType
     * @since Spring 2019
     * @version 3.0
     */

    public String setPartType(String partType) {
        this.partType = partType;
        return partType;
    }

    /**
     * Get part type
     * @author David Lulko
     * @return partType
     * @since Spring 2019
     * @version 3.0
     */

    public String getPartType() {
        return partType;
    }

    /**
     * Set part ID
     * @author David Lulko
     * @param partID
     * @since Spring 2019
     * @version 3.0
     */
    public int setPartID(int partID) {
        this.partID = partID;
        return partID;
    }

    /**
     * Get part ID
     * @author David Lulko
     * @return partID
     * @since Spring 2019
     * @version 3.0
     */

    public int getPartID() {
        return partID;
    }

    /**
     * List each part in the parts list
     * @author David Lulko
     * @since Spring 2019
     * @version 3.0
     */

    public static void listParts(ArrayList<Parts> partList) {
        for (Parts part : partList) {
            System.out.println("Part ID: " + part.getPartID());
            System.out.println("Part Name: " + part.getPartName());
            System.out.println("Part Type: " + part.getPartType() + "\n");
        }
    }
}