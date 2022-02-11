package com.webapp.fairBeans.services;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.repositories.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
            return (List<Partner>) partnerRepository.findByArea(area);
        }
    }
}
