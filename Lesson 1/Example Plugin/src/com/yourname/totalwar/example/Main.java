package com.yourname.totalwar.example;

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
	 */
	
	// This is an example of a variable which is an "int" which stands for integer, any number between -129 and 129
	public int exampleInteger = 49;
	
	// boolean = true or false, also i made a mistake: when naming variables its usually good to keep the first word lowercase such as "doThisExample" and not "NotThisExample"
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

}
