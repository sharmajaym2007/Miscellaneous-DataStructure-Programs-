/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jay Sharma
 */
public class day {
    
    public static void main(String[] args) throws ParseException {
        //Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date d = df.parse("08-18-2015");
        //System.out.println(new SimpleDateFormat("E").format(cal.getTime()));
        System.out.println(new SimpleDateFormat("E").format(d));
    }
            
            
    
}
