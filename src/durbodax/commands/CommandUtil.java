package durbodax.commands;

import java.util.HashMap;


/**
 *
 * @author Kirk Seddon
 */
public class CommandUtil {
    
    private static HashMap commands = new HashMap();
    
    private CommandUtil() {}
    
    public static final Command getCommand(String name) {
    	System.out.println("flow:119");
        Command command = ((Command)commands.get(name.toLowerCase()));
 
        return command;
        
    }    
    
    public static final void registerCommand(String name, Command command) {
    	System.out.println("flow:120");
        commands.put(name.toLowerCase(), command);
        
    }

    public static Command getComputeChildCreditCommand() {
    	System.out.println("flow:121");
        ComputeChildCredit command = new ComputeChildCredit();
        command.suppressOutput();
        return command;
    }

    public static Command getComputeInLawTaxCommand() {
    	System.out.println("flow:122");
        ComputeInLawTax command = new ComputeInLawTax();
        command.suppressOutput();
        return command;
    }

}

