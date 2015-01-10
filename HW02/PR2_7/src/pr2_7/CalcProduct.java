/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;

/**
 * Contains a product that has a name and a price/cost and methods to get 
 * additional information about how the product selling.
 * 
 * @author bmetzelaar16
 */
public class CalcProduct {
    String pName;
    double pPrice;
    
    /**
     * Constructor that takes in the product name and selling price as the object
     * is created.
     * 
     * @param name product name
     * @param price amount of money the product is being sold for
     */
    public CalcProduct(String name, double price){
        pName = name;
        pPrice = price;
    }
    
    /**
     * Calculates the money the product is brining in based on the amount sold
     * and the price of the product.
     * <p>
     * The label profit may be misleading due to the fact that the money may not 
     * be all profit because you need to spend money to buy/create the product 
     * in the first place. This will be updated if I find a proper wording 
     * replacement.
     * 
     * @param sold number of products sold
     * @return the total amount of money made (profit)
     */
    public double profit(int sold){
        return pPrice * sold;
    }
    
    /**
     * Give the product a name.
     * @param name product's name
     */
    public void setpName(String name){
        pName = name;
    }
    
    /**
     * Give the product a price to sell at.
     * @param price the monetary value that the product is to be sold at
     */
    public void setpPrice(double price){
        pPrice = price;
    }
    
    /**
     * Return the name of the product.
     * @return the name of the product
     */
    public String getpName(){
        return pName;
    }
    
    /**
     * Return the current price of the product.
     * @return the price that the product is being sold at
     */
    public Double getpPrice(){
        return pPrice;
    }
}
