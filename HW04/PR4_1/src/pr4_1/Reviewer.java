/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1;

/**
 * Objects represent a user's review of a product/service such as a restaurant
 * experience.
 * <p>
 * A review consists of a business name, the address of business, the user
 * review itself, and user rating.
 *
 * @author Brennan
 */
public class Reviewer {

    String name;    // business/company name
    String addr;    // address
    String review;  // review
    int rating;     // rating

    /**
     * Constructor that initializes the review fields.
     *
     * @param name title/name of the business
     * @param addr address location of the business
     * @param review text of the user's review
     * @param rating a score that ranges from 1-5
     * @throws Exception value for rating is out of bounds (must be 1-5)
     */
    public Reviewer(String name, String addr, String review, int rating) throws Exception {
        if ((rating < 1) || (rating > 5)) {
            throw new Exception("Rating must have an integer value between 1-5\n");
        } else {
            this.name = name;
            this.addr = addr;
            this.review = review;
            this.rating = rating;
        }
    }

    /**
     * Return a string of the Review information (name, address, review, and
     * rating) that includes each attribute being separated by a pipe "|".
     *
     * @return String of object values separated by a pipe
     */
    public String outputReviewerPattern() {
        return name + "|" + addr + "|" + review + "|" + rating;
    }

    /**
     * A string with information about this object's review
     *
     * @return String containing object information
     */
    @Override
    public String toString() {
        return "Business: " + name + ", Located At: " + addr + ", Rated: " + rating;
    }
}
