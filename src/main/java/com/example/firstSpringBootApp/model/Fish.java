package com.example.firstSpringBootApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
public class Fish {

    @Id
    @GeneratedValue
    private Long id;
    //@Column(name="sds")
    @Column(unique = true)
    private String name;
    private String type;
    private double price;
}
