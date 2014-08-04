package com.nagarro.assignment6.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nagarro.assignment6.constants.Constants;
import com.nagarro.assignment6.industry.GarmentFactory;
import com.nagarro.assignment6.industry.GarmentIndustry;
import com.nagarro.assignment6.main.ProgramLauncher;

public class ClientService {
	public void ServiceClientRequest() {

		GarmentIndustry industry;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in))) {
			do {
				System.out.println("Enter your selection - ");
				String garment = reader.readLine();
				industry = new GarmentFactory().getGarment(garment);
				if (null == industry) {
					System.out.println(Constants.INCORRECT_INPUT);
					continue;
				} else {
					industry.print();
				}
			} while (null == industry);
		} catch (IOException e) {
		}
	}
}
