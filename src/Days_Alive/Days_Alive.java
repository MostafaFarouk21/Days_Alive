/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Days_Alive;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Days_Alive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name ;
        int Birthyear ;
        int Days_live , Hours_live ,Seconds_live ;
        Scanner s = new Scanner(System.in);
        System.out.println("Your name plz...");
        name = s.next();
        System.out.println("Your BirthYear plz...");
        Birthyear = s.nextInt();
        
        int cur_year = Calendar.getInstance().get(Calendar.YEAR);
        
        Days_live = (cur_year - Birthyear) * 365 ;
        
        System.out.println("The days you lived = "+Days_live);
        
        int hour = Calendar.getInstance().get(Calendar.HOUR);
        
        Hours_live = (cur_year-Birthyear)*365*24 ;
        
          System.out.println("The Hour you lived = "+Hours_live);

        int Second = Calendar.getInstance().get(Calendar.SECOND);
        
        Seconds_live = (cur_year-Birthyear)*365*24*60*60 ;
        System.out.println("The Seconds you lived = "+Seconds_live);
        
    }
    
}
