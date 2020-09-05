package com.mt.springWeb.com.mt.springWeb.basic.graphmodels;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.RelationshipEntity;

@NodeEntity
public class State {
    @Id
    @GeneratedValue
    private Long id;

    public void State(){}

    public State(String name, String resourceID) {
        this.name = name;
        this.resourceID = resourceID;
    }

    private String name;

    private String resourceID;

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
