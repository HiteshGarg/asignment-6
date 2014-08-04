/**
 * 
 */
package com.nagarro.assignment6.industry;


/**
 * @author hiteshgarg
 *
 */
public class Shirt implements GarmentIndustry {

	static int a = 100;
	private String garment;
	/* (non-Javadoc)
	 * @see com.nagarro.assignment6.industry.GarmentIndustry#print(java.lang.String)
	 */
	public Shirt(String garment) {
		// TODO Auto-generated constructor stub
		this.garment = garment;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("You Select - "+garment);
	
	}

}
