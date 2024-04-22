package edu.iu.habahram.ducksservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "ducks")
public class DuckEntity {

    @Id
    private String id;
    private String name;
    private String type;
    public DuckEntity(){}

    public DuckEntity(String id, String name, String type) {}


    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType(String type) {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String type() {
        return type;
    }
}
