package com.webapp.fairBeans.controllers;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.services.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PartnerController {

    @Autowired
    private final PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        this.partnerService = partnerService;
    }

    @RequestMapping(value="/partners", method=RequestMethod.GET)
    public String getPartners(@RequestParam(value="area", required = false) String area, Model model) {
        model.addAttribute("partners", partnerService.getPartners(area));
        return "partners";
    }

    @RequestMapping(value="/partner/add", method=RequestMethod.GET)
    public String addPartnerSite() {
        return "add-partner";
    }

    @RequestMapping(value="/partner/add/success", method=RequestMethod.POST)
    public String addPartner(@RequestParam String name, @RequestParam String street, @RequestParam String houseNumber,
                           @RequestParam String zipCode, @RequestParam String city, @RequestParam String email,
                           Model model) {
        partnerService.addPartner(name, street, houseNumber, zipCode, city, email);
        model.addAttribute("message", String.format("Partner %s had been added.", name));
        return "add-partner";
    }
}
