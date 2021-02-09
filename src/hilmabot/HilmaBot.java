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
        // Langa in Token istället för args[0] eller använd kommandolinjen
        if (args.length < 1) {
            System.out.println("Du måste langa in en token");
            System.exit(1);
        }
        JDABuilder builder = JDABuilder.createDefault(args[0]);
        
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setActivity(Activity.watching("Din mamma"));
        
        try{
            builder.build();
        }catch(Exception e) {
            System.out.print("Något gick helt jävla fel: " + e.getMessage());
        }
    }
     

    
    }
