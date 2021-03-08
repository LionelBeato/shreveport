package com.tts.practicesession.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Crystal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;
    @Size(max=20)
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crystal(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Crystal() {

    }


}
