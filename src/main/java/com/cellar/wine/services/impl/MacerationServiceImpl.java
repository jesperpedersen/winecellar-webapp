/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package com.cellar.wine.services.impl;

import com.cellar.wine.models.Maceration;
import com.cellar.wine.repositories.MacerationRepository;
import com.cellar.wine.services.MacerationService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class MacerationServiceImpl implements MacerationService {

    @Inject
    private MacerationRepository macerationRepository;

    @Override
    public Maceration findById(Long aLong) {
        return null;
    }

    @Override
    public Maceration save(Maceration object) {
        return macerationRepository.save(object);
    }

    @Override
    public void delete(Maceration object) {

    }

}
