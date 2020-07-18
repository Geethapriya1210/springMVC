package com.xworkz.spring.calamities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.spring.calamities.dao.CalamityDAO;
import com.xworkz.spring.calamities.dto.CalamityDTO;

@Service
public class CalamityServiceimpl implements CalamityService {

	@Autowired
	private CalamityDAO calamityDAO;

	public CalamityServiceimpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	
	public int validateAndSave(CalamityDTO calamityDTO) {

		System.out.println("Start: validateSave" );
		int isValid = 1;

		try {
			if (calamityDTO != null) {
				System.out.println("Starting to validate Calamities");

				String place = calamityDTO.getPlace();
				if (place != null && !place.isEmpty()) {
					System.out.println("Place is valid");
					isValid = 0;
				} else {
					System.out.println("Place is not valid");
					isValid = 1;
				}
				String date = calamityDTO.getDate();
				if (isValid == 0 && date != null && !date.isEmpty()) {
					System.out.println("Date is valid");
					isValid = 0;
				} else {
					System.out.println("Date is not valid");
					isValid = 1;
				}
				String type = calamityDTO.getCalamityType();
				if (isValid == 0 && type != null && !type.isEmpty()) {
					System.out.println("Calamity Type is valid");
					isValid = 0;
				} else {
					System.out.println("Calamity Type is not valid");
					isValid = 1;
				}
			}
			if (isValid == 0) {
				System.out.println("Data is valid and can save fields");
				calamityDAO.save(calamityDTO);
				return isValid;
			}
			System.out.println("End: validateSave Calamities " + calamityDTO);
		} catch (Exception e) {
			System.err.println("Exception in validateSave " + e.getMessage());
		}
		return isValid;
	}
}
