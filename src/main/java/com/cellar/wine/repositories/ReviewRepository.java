/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package com.cellar.wine.repositories;

import com.cellar.wine.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT r FROM Review r WHERE r.user.id = :userid AND r.id = :id")
    Review findByUser(@Param("userid") Integer userId, @Param("id") Long id);

    @Query("SELECT r FROM Review r WHERE r.user.id = :userid AND r.wine.id = :wineid")
    Review findByWine(@Param("userid") Integer userId, @Param("wineid") Long wineId);

}
