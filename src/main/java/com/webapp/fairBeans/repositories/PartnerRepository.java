package com.webapp.fairBeans.repositories;

import com.webapp.fairBeans.domain.Partner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartnerRepository extends CrudRepository<Partner, Long> {

    @Query(value = "SELECT * FROM partner WHERE zip_code LIKE %:area% OR city LIKE %:area%", nativeQuery = true)
    List<Partner> findByArea(@Param("area") String area);
}
