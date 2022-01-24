package com.webapp.fairBeans;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.repositories.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FairBeansApplication implements CommandLineRunner {

	@Autowired
	private PartnerRepository partnerRepository;

	public static void main(String[] args) {
		SpringApplication.run(FairBeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Partner> partners = partnerRepository.findAll();
		for (Partner partner : partners) {
			System.out.println(partner);
		}
	}
}
