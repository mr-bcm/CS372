/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;

/**
 *
 * @author bmetzelaar16
 */
public class CalcProduct {
    String pName;
    double pPrice;
    
    public CalcProduct(String name, double price){
        pName = name;
        pPrice = price;
    }
    
    public double profit(int sold){
        return pPrice * sold;
    }
}
