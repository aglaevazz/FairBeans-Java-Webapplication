package com.webapp.fairBeans.services;

import com.webapp.fairBeans.repositories.PartnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class PartnerService {

    private final PartnerRepository partnerRepository;

    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    public void getPartners(String area, Model model) {
        if (area == null) {
            model.addAttribute("partners", partnerRepository.findAll());
        }
        else {
            model.addAttribute("partners", partnerRepository.findByArea(area));
        }
    }
}
