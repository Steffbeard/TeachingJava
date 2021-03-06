/*
 * Now let's make a basic command class
 * 
 * It's good practice to organize things in different sub packages such as: 
 * putting commands in a commands package, listeners in a listeners package, etc.
 * 
 * For simple plugins that only have one function and not many files its not really important
 * but for bigger plugins with more than 5-8 class files it can get very disorganized
 * 
 * Having a seperate commands package and classes for each command also let you add more commands than just one and keep them all organized
 */

package com.yourname.totalwar.example.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

// you shouldn't name this "Command" because there already exists a Command: "org.bukkit.command.Command"
// 
// also notice this is "implements" not extends because CommandExecutor is an interface that defines what a command should look like
// 
// we implement this interface so it can build the layout of the command and so that way the server knows that this class is supposed to be
// a command
public class ExampleCommand implements CommandExecutor {

	// this is an auto generated method stub
	// that means i didn't actually type this and it was autogenerated by eclipse when i right clicked on "ExampleCommand" 
	// and clicked on "Add unimplemented methods" its a good way to save time sometimes
	//
	// as you can see it's @Override because it follows bukkit's layout for what a command is and will tell us if we did something wrong
	// 
	// In this method it defines all of the fields for us already for example
	//
	// CommandSender is defined as "arg0", this means if we use the variable "arg0", it will use the org.bukkit.command.CommandSender class.
	// A command sender is the person who does the command
	//
	// Command is the actual command
	// String is what the player types or what the command returns
	//
	// onCommand is a boolean, meaning it is only a true or false that checks if the player actually does the command
	// you need to define what happens later by making more methods
	//
	// as you can see it returns false by default because you need to use an "if" statement to check if a player actually did the command correctly
	// if not it automatically sets it to false because we dont want the command to fire if no one actually did the command or if it was done incorrectly
	// it will simply return the "usage:" field in the plugin.yml if done incorrectly
	
//	@Override
//	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	/*
	 * Now let's make an actual command. First step lets change "arg0", "arg1", "arg2", and "arg3" into actual usable variables
	 * This way it is easier to use
	 */
	
	 @Override
	 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// This if statement checks first to see if the person doing the command is an actual player not console or a commandblock 
		if (sender instanceof Player) {
		// need to define what a player is, first we import Player from org.bukkit.entity.Player
		// then we assign it a variable, 
		/*
		 * org.bukkit.entity.Player is now just "player"
		 * 
		 * Player player
		 * 
		 * Now we assign org.bukkit.entity.Player to "sender" to check if "sender" really is a "Player"
		 * 
		 * Player player = (Player) sender;
		 */
	    Player player = (Player) sender;
	    
	    // if the person is a player then we can now put our command
	    
	    // let's say this command was called "ping" and returns "pong" when players do /ping
	    
	    player.sendMessage("Pong!");
	    
		}
		
		// if done incorrectly or if not a player it will return the usage defined in plugin.yml
		return false; 
	 }
}

/*
 * Ok now that this is done, lets go register this command in our Main.java
 */
