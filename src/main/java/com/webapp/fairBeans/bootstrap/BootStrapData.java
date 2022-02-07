package com.webapp.fairBeans.bootstrap;

import com.webapp.fairBeans.domain.Partner;
import com.webapp.fairBeans.domain.Product;
import com.webapp.fairBeans.repositories.PartnerRepository;
import com.webapp.fairBeans.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartnerRepository partnerRepository;
    private final ProductRepository productRepository;

    public BootStrapData(PartnerRepository partnerRepository, ProductRepository productRepository) {
        this.partnerRepository = partnerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Partner dreamCafe = new Partner("Dream Café", "Highroad", "27", "3214", "Newtown", "www.dream_cafecom");
        Partner cozyRozie = new Partner("Cozy Rozie", "Mixlane", "2", "6548", "Maicity", "www.cozy_rozie.com");
        Partner theCoffieGang = new Partner("The Coffie Gang", "Firestreet", "66", "5332", "Lipcity", "www.the_coffie_gang.com");
        Partner beansAndMilk = new Partner("Beans and Milk", "Alabastarroad", "2", "6548", "Moldue", "www.beans_and_milk.com");
        Partner creamy = new Partner("Creamy", "Redlane", "66", "5332", "Pelikan", "www.creamy.com");

        Product colombianBlondRoast = new Product("colombian blond roast", "Velvety coffee with a note of caramel");
        Product diamondBlend = new Product("diamond blend", "Keeps you awake through the longest days");

        dreamCafe.getProducts().add(colombianBlondRoast);
        colombianBlondRoast.getPartners().add(dreamCafe);

        partnerRepository.save(dreamCafe);
        partnerRepository.save(cozyRozie);
        partnerRepository.save(theCoffieGang);
        partnerRepository.save(beansAndMilk);
        partnerRepository.save(creamy);
        productRepository.save(colombianBlondRoast);
        productRepository.save(diamondBlend);
    }
}
