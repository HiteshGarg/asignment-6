/**
 * 
 */
package com.nagarro.assignment6.industry;

import com.nagarro.assignment6.constants.Constants;

/**
 * @author hiteshgarg
 *
 */
public class GarmentFactory {

	GarmentIndustry industry;
	
	public GarmentIndustry getGarment(String garment){
		
		switch(garment.toLowerCase()){
		case Constants.SHIRT:
			industry = new Shirt(garment);
			break;
		case Constants.TROUSERS:
			industry = new Trousers(garment);
			break;
		default:
			industry = null;
		}
		return industry;
	}
}
