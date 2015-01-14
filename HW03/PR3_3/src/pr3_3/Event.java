/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

/**
 *
 * @author Brennan
 */
public class Event {
    String name = "";
    String location = "";
    int month = 0;
    int day = 0;
    int year = 0;
    
    public Event(String name, String location, int month, int day, int year){
        this.name = name;
        this.location = location;
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public String outputEvent(){
        return name + " " + location + " " + month + "/" + day + "/" + year;
    }
    
    public String outputEventPattern(){
        String tName = "<name>" + name + "<1done>";
        String tLoc = "<location>" + location + "<2done>";
        String tDate = "<date>" + month + "/" + day + "/" + year + "<3done>";

        return tName + tLoc + tDate;
    }
}