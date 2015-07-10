/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.io.PrintWriter;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class InventoryReportView {
    private static final PrintWriter logFile = PathOfTheJedi.getLogFile();
    
    public static void display(String className, String reportMessage) {
        
        
        // log report
        logFile.println(className + " - " + reportMessage);
    }
    
}
