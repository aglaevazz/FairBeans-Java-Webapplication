package com.webapp.fairBeans.controllers;

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
        partnerService.getPartners(area, model);
        return "partners";
    }
}
