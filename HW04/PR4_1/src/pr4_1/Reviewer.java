/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1;

/**
 *
 * @author Brennan
 */
public class Reviewer {
    String name;    // business/company name
    String addr;    // address
    String review;  // review
    int rating;     // rating
    
    public Reviewer (String name, String addr, String review, int rating){
        this.name = name;
        this.addr = addr;
        this.review = review;
        this.rating = rating;
    }
    
    public String outputReviewerPattern(){
        return name + "|" + addr + "|" + review + "|" + rating;
    }
}
