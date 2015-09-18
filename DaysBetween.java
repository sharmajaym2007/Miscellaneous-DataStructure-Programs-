/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Jay Sharma
 */
public class DaysBetween {
    
    public void DateBetween(String date1, String date2)
    {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
            Date d1=sdf.parse(date1);
            Date d2=sdf.parse(date2);
            long a = d1.getTime()-d2.getTime();
            System.out.println("Days Between"+(a/(1000*60*60*24)));
            
            
        } catch (ParseException ex) {
            Logger.getLogger(DaysBetween.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public static void main(String[] args) {
        DaysBetween db=new DaysBetween();
        db.DateBetween("08 25 2015", "08 17 2015");
    }
    
}
