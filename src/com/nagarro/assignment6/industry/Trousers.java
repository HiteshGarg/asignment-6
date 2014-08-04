/**
 * 
 */
package com.nagarro.assignment6.industry;

/**
 * @author hiteshgarg
 *
 */
public class Trousers implements GarmentIndustry {

	private String garment;
	
	public Trousers(String garment) {
		// TODO Auto-generated constructor stub
		this.garment = garment;
	}
	/* (non-Javadoc)
	 * @see com.nagarro.assignment6.industry.GarmentIndustry#print()
	 */
	@Override
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("You Select - "+ garment);
	}

}
