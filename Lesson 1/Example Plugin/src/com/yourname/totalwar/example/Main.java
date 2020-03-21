
// This is correct package naming. In all honesty, packages can be whatever
// but the best way to do it is to put a website URL in reverse
// if you dont have one you can just put your name instead of a website name
// the .com comes first and becomes com.
// then your name so com.yourname
// personally i put totalwar because its the organization im coding for but you dont even need this part
// then I like to put the name of the plugin you are making so that way if you have multiple plugins you know which class is from where
// this plugin is called "Example" so it would be:

package com.yourname.totalwar.example;

// these are imports, they import outside code that you didn't hand write.
// all imports come from either the default Java library from eclipse
// or from your buildpath

// this import tells us that from the "org.bukkit.plugin.java" PACKAGE, we imported the JavaPlugin CLASS
// Class names are always capitilzed, package names usually shouldn't be capitilized
// you always capitilize the first letter of each word if its more than one word
// LikeThisForExample

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	/*
	 * And the reason we name it Main or "YourPlugin" is because this is the ONLY class that
	 * can "extends JavaPlugin". All the other classes (such as listeners and events and commands) loop back to this
	 * This is the class file that deterimines <--- however u spell, what the plugin does when it gets loaded and its the first
	 * class to be loaded
	 * 
	 * see "plugin.yml" for more details
	 * 
	 * ok now we want to figure out what the plugin should do when it first starts up
	 * 
	 * You should probably learn some java keywords first
	 * 
	 * public = any other file within the source or src folder can access it, it works for variables, classes, and methods
	 * 
	 * private = private variables that are defined only for this class file, it works for variables, classes, and methods
	 * 
	 * void = no return value expected
	 * 
	 * boolean = true/false expected
	 * 
	 * double, int, long = number expected
	 * 
	 * String = "string" or sentence expected
	 * 
	 * You should look at a full list of keywords and definitions here: 
	 * https://en.wikipedia.org/wiki/List_of_Java_keywords
	 */
	
	// when naming variables or methods 
	// its usually good practice to keep the first word lowercase, and capitilize the first letter of every word after
	// such as "likeThisExample" and not "LikeThisExample"
	// "doThis", "NotThis"
	
	// This is an example of a variable which is an "int" which stands for integer, any number between -129 and 129
	public int exampleInteger = 49;
	
	// boolean = true or false 
	public boolean exampleTrueFalse = true;
	
	// This is an example of a method, its the onEnable method and whatever i type under it happens whenever i call the method
	// this is also the most basic method of any plugin because these are the first steps a plugin takes when it gets loaded
	// you also need the @Override annotation because if you make a mistake it will tell you
	
	/*
	 * Indicates that a method declaration is intended to override a method declaration in a supertype. 
	 * If a method is annotated with this annotation type compilers are required to generate an error message 
	 * unless at least one of the following conditions hold:
	 * 
	 * The method does override or implement a method declared in a supertype.
	 * The method has a signature that is override-equivalent to that of any public method declared in Object.
	 */
	
	@Override
	public void onEnable() {
		
	}
	
	// This is what happens on disable
	@Override
    	public void onDisable() {
        
	}
	
	// If you want to reload the plugin so you dont have to restart the whole server
	// you can make a method like this, to call later with a command
	// this one doesnt have an @Override because its not part of the JavaPlugin set up so it wont help you here
	// and it wont work with an @Override because it doesnt have to override anything
	public void onReload() {
		this.onDisable();
		this.onEnable();
	}
}	
