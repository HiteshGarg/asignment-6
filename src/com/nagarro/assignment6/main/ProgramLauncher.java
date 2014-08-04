/**
 * 
 */
package com.nagarro.assignment6.main;

import org.apache.log4j.Logger;

import com.nagarro.assignment6.client.ClientService;

/**
 * The main point where the program initiates
 * @author hiteshgarg
 */
public class ProgramLauncher {

	static Logger log = Logger.getLogger(ProgramLauncher.class.getName());
	/**
	 * Main method of program launcher
	 * @param args
	 */
	public static void main(String[] args) {
		
		new ClientService().ServiceClientRequest();
	}

}
