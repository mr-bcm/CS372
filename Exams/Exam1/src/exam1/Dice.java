/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.Random;

/**
 * Creates a dice with a set amount of sides and the ability to roll the dice.
 *
 * @author bmetzelaar16
 */
public class Dice {

    int sides = 0; // number of sides the dice has
    Random rnd = new Random();

    /**
     * Initialize the amount of sides that the dice has.
     *
     * @param sides sides that the dice can have
     * @throws Exception the dice does not have enough sides
     */
    public Dice(int sides) throws Exception {
        if (sides <= 2) {
            throw new Exception("A dice must have more than 2 sides.");
        }
        this.sides = sides;
    }

    /**
     * Roll the dice with the value returned being a random number between 1 and
     * the number of sides that the dice has.
     *
     * @return side the dice landed on
     */
    public int roll() {
        return (rnd.nextInt(sides) + 1);
    }
}
