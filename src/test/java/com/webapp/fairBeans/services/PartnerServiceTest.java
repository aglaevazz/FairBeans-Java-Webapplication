package com.webapp.fairBeans.services;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.repositories.PartnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PartnerServiceTest {

    @Mock
    private PartnerRepository partnerRepository;

    @InjectMocks
    private PartnerService partnerService;

    private List<Partner> partners;

    @BeforeEach
    private void initEach() {
        Partner partnerA = new Partner("name", "street", "houseNumber", "zipCode",
                "city", "email");
        Partner partnerB = new Partner("name", "street", "houseNumber", "zipCode",
                "city", "email");
        partners = Arrays.asList(partnerA, partnerB);
    }

    @Test
    public void getPartnersAreaIsNull() {
        // test with area = null
        when(partnerRepository.findAll()).thenReturn(partners);
        List<Partner> partnersResult = partnerService.getPartners(null);
        assertEquals(partners, partnerService.getPartners(null));
    }

    @Test
    public void getPartners() {
        // test with area = "zip"
        when(partnerRepository.findByArea("zip")).thenReturn(partners);
        List<Partner> partnersResult = partnerService.getPartners("zip");
        assertEquals(partners, partnerService.getPartners(null));
    }
}
