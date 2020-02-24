/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YearEnd;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jose Luis Perez
 */
public class YearEnd {
    
    private Calendar fecha = new GregorianCalendar();
    
    public int getDiaDelAnio() {
        return  (365 - fecha.get(Calendar.DAY_OF_YEAR));
    }
}
