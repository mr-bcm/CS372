/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celsiusconverter;

/**
 *
 * @author bmetzelaar16
 */
public class Converter {
    private double currentCelsius;
    public Converter(double c) {
        setCelsius(c);
    }
    
    public double getCelsius(){return currentCelsius;}
    public void setCelsius(double c) { currentCelsius = c;}
    
    public double toFehrenheit() {
        return currentCelsius * (9/5.0) + 32;
    }
}