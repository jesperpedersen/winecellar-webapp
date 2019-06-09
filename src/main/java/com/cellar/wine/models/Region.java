package com.cellar.wine.models;

import lombok.*;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Region extends BaseEntity implements Comparable<Region> {

    @Builder
    public Region(Long id, String name, String description, String weblink) {
        super(id);
        this.name = name;
        this.description = description;
        this.weblink = weblink;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "description", length = 8192)
    private String description;

    @Column(name = "weblink")
    private String weblink;

    @ManyToMany
    @JoinTable(name = "region_area",
            joinColumns =
            @JoinColumn(name = "region_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "area_id", referencedColumnName = "id")
    )
    private List<Area> areas;

    public List<Area> getAreas() {
        areas.forEach(area -> {
            if (area.getName().equals(this.name)) {
                Collections.swap(areas, areas.indexOf(area), 0);
            }
        });
        return areas;
    }

    @Override
    public int compareTo(Region r) {
        return name.compareTo(r.getName());
    }
}