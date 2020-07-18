package com.xworkz.spring.calamities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.calamities.dto.CalamityDTO;

@Component

public class CalamityDAOImpl implements CalamityDAO {

	@Autowired
	private SessionFactory factory;

	public CalamityDAOImpl() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	public void save(CalamityDTO calamityDTO) {
		{
			Session session = this.factory.openSession();
			try {

				System.out.println("Start: save method in CalamityDAOImpl ");
				System.out.println("session created");
				System.out.println("Starting transaction");
				session.beginTransaction();
				System.out.println("Saving " );
				session.save(calamityDTO);
				session.flush();
				session.getTransaction().commit();
				System.out.println("Committed Transaction");

			} catch (Exception e) {
				System.err.println("Exception in create method" + e.getMessage());
				e.printStackTrace();
				session.getTransaction().rollback();
			} finally {
				System.out.println("Closing session");
				session.close();
			}
			System.out.println("End: save method in CalamityDAOImpl ");

		}

	}
}