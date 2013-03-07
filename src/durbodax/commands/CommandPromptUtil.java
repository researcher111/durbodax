package durbodax.commands;

import java.util.HashMap;


/**
 *
 * @author Kirk Seddon
 */
public class CommandPromptUtil {
    
    private static HashMap commandPrompts = new HashMap();
    
    private CommandPromptUtil() {}
    
    public static final CommandPrompt getCommandPrompt(String name) {
    	System.out.println("flow:117");
        CommandPrompt prompt = ((CommandPrompt)commandPrompts.get(name.toLowerCase()));
 
        return prompt;
        
    }    
    
    public static final void registerCommandPrompt(String name, CommandPrompt prompt) {
    	System.out.println("flow:118");
        commandPrompts.put(name.toLowerCase(), prompt);
        
    }

}

