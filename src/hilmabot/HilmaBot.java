/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilmabot;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;

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
        
        System.out.println("Bygger..."); 
        builder.build();
        System.out.println("Färdigt!");
    }
    
}
