package com.tts.reviewspring.model;

// this model will allow us to send a greeting
// to a user

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "greeting_id")
    private Long id;
    private String salutation;


    public Greeting(String salutation) {
        this.salutation = salutation;
    }


}
