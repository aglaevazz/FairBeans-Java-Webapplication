package com.webapp.fairBeans.services;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.repositories.PartnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {

    private final PartnerRepository partnerRepository;

    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    public List<Partner> getPartners(String area) {
        if (area == null) {
            return (List<Partner>) partnerRepository.findAll();
        }
        else {
            return partnerRepository.findByArea(area);
        }
    }

    public void addPartner(String name, String street, String houseNumber, String zipCode, String city, String email) {
        Partner partner = new Partner(name, street, houseNumber, zipCode, city, email);
        partnerRepository.save(partner);
    }
}
