package com.cellar.wine.services;

import com.cellar.wine.models.Country;

import java.util.Set;

public interface CountryService extends CrudService<Country, Long> {

    Country findByName(String name);

    Set<Country> findWithRegions();

}