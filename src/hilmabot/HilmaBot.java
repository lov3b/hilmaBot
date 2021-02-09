/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilmabot;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author love, Hubbe
 */
public class HilmaBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        JDABuilder builder = JDABuilder.createDefault(args[0]);
        
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setActivity(Activity.watching("Hilma ta sin jävla medicin"));
        
        try {
            builder.build();
        }catch(Exception e) {
            System.out.print("Något gick helt jävla fel (e.getMessage())");
        }
        
        
        try {
            TimeUnit.MINUTES.sleep(2);
        }catch(Exception e) {
            System.out.print("Något gick helt jävla fel (e.getMessage())");
        }
    }
    
}
