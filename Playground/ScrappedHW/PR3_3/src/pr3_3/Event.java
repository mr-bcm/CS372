/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

/**
 * Creates Event objects that consist of a name, location, and date.
 *
 * @author Brennan
 */
public class Event {

    String name = "";
    String location = "";
    int month = 0;
    int day = 0;
    int year = 0;

    /**
     * Initialize the event with a name, location and date (month, day, year).
     *
     * @param name name of the event
     * @param location where the event is is located
     * @param month the month of the event
     * @param day the day of the event
     * @param year the year that the event is held
     * @throws Exception if any of the variables are given obvious bad values
     */
    public Event(String name, String location, int month, int day, int year)
            throws Exception {
        if (name.equals("") || location.equals("")) {
            throw new Exception("Name and Location must be properly initialized.\n");
        } else if ((month <= 0) || (month > 12)) {
            throw new Exception("Month must be between 1-12\n");
        } else if ((day <= 0) || (day > 31)) {
            throw new Exception("Day must be between 1-31\n");
        } else if (year < 0) {
            throw new Exception("Year cannot be negative\n");
        } else {
            this.name = name;
            this.location = location;
            this.month = month;
            this.day = day;
            this.year = year;
        }
    }

    /**
     * Return a string of the name, location, and date of the current event
     * object
     *
     * @return string of the event objects name, location, month, day, and year
     */
    public String outputEvent() {
        return name + " " + location + " " + month + "/" + day + "/" + year;
    }

    /**
     * Output a string of the event name, location, and date (month, day, year)
     * with additional formatting that aids in parsing and retrieving the data
     * from a saved file.
     *
     * @return string of name, location, month, day, and year formatted for
     * parsing
     */
    public String outputEventPattern() {
        String tName = "<name>" + name + "<1done>";
        String tLoc = "<location>" + location + "<2done>";
        String tMonth = "<month>" + month + "<3done>";
        String tDay = "<day>" + day + "<4done>";
        String tYear = "<year>" + year + "<5done>";

        return tName + tLoc + tMonth + tDay + tYear;
    }

    public String getDate() {
        return month + "/" + day + "/" + year;
    }

}
