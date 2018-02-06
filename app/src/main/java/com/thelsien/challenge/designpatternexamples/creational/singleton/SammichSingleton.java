package com.thelsien.challenge.designpatternexamples.creational.singleton;

/**
 * http://www.oodesign.com/singleton-pattern.html
 */
public class SammichSingleton {
    private static SammichSingleton instance;

    private static final String BASE_DESCRIPTION = "This is a basic sammich.";
    private String description = BASE_DESCRIPTION;

    private SammichSingleton() {
        //must be private, you cannot make an instance through 'new' operator
    }

    public static SammichSingleton getInstance() {
        if (instance == null) {
            //if there is no instance yet, create one.
            instance = new SammichSingleton();
        }

        //this instance is the only one throughout the app.
        return instance;
    }

    /**
     * This method is only callable on the instance.
     * @return The sammich description.
     */
    public String getSammichDescription() {
        return description.equals("") ? BASE_DESCRIPTION : description;
    }

    /**
     * Set the sammich description.
     * @param description The sammich description to set.
     */
    public void setSammichDescription(String description) {
        this.description = description;
    }
}
