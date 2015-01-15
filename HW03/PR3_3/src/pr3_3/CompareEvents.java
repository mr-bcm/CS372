/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.util.*;
//import pr3_3.Event;

/**
 *
 * @author bmetzelaar16
 */
public class CompareEvents implements Comparator<Event> {

    @Override
    public int compare(Event x, Event y) {
        return x.name.compareToIgnoreCase(y.name);

    }
}
