package com.servelots.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Pagelet {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
