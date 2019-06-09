package com.cellar.wine.repositories;

import com.cellar.wine.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM country c JOIN country_regions cr ON c.id = cr.country_id ORDER BY c.name")
    Set<Country> findWithRegions();
}